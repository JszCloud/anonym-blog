package cn.name168.anonym.blog.admin.config.shiro;

import cn.name168.anonym.blog.bean.entity.SysMenu;
import cn.name168.anonym.blog.bean.entity.SysRole;
import cn.name168.anonym.blog.bean.entity.SysUser;
import cn.name168.anonym.blog.service.service.ISysMenuService;
import cn.name168.anonym.blog.service.service.ISysRoleService;
import cn.name168.anonym.blog.service.service.ISysUserService;
import cn.name168.anonym.blog.service.service.ShiroService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.mgt.RealmSecurityManager;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.subject.support.DefaultSubjectContext;
import org.crazycake.shiro.RedisSessionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by Nominal on 2018/5/21 0021.
 * 微博：@Mr丶Li_Anonym
 */
@Component
public class MyShiroRealm extends AuthorizingRealm {

    @Autowired
    ISysUserService iSysUserService;
    @Autowired
    ISysRoleService iSysRoleService;
    @Autowired
    ISysMenuService iSysMenuService;
    @Autowired
    private RedisSessionDAO redisSessionDAO;

    @Autowired
    ShiroService shiroService;


    /**
     * 提供账户信息返回认证信息（用户的角色信息集合）
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("身份认证方法：MyShiroRealm.doGetAuthenticationInfo()");
        //获取用户的输入的账号.
        String username = (String) token.getPrincipal();
        SysUser user = iSysUserService.findByUsername(username);
        if (user == null) {
            throw new UnknownAccountException("账号不存在！");
        }else if (user.getStatus() == 0 ) {
            throw new LockedAccountException("帐号已被锁定，禁止登录！");
        }
        // 当验证都通过后，把用户信息放在session里
        Session session = SecurityUtils.getSubject().getSession();
        session.setAttribute("userSession", user);
        session.setAttribute("userSessionId", user.getUserId());
        // principal参数使用用户Id，方便动态刷新用户权限
        return new SimpleAuthenticationInfo(username,user.getPassword(),getName());
    }

    /**
     * 权限认证，为当前登录的Subject授予角色和权限（角色的权限信息集合）
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("权限认证方法：MyShiroRealm.doGetAuthenticationInfo()");

        System.out.println("打印："+SecurityUtils.getSubject().getPrincipal());
        //Long userId = (Long) SecurityUtils.getSubject().getPrincipal();
        SysUser token = iSysUserService.findByUsername(String.valueOf(SecurityUtils.getSubject().getPrincipal()));
        Long userId =token.getUserId();

        // 权限信息对象info,用来存放查出的用户的所有的角色（role）及权限（permission）
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //用户权限列表
       /* Set<String> permsSet = shiroService.getUserPermissions(userId);

        info.addStringPermissions(permsSet);*/
        List<SysRole> roles=iSysRoleService.findByUserId(userId);
        //赋予角色
        for (SysRole role : roles) {
            System.out.println("角色："+role.getRoleName());
            info.addRole(role.getRoleName());
        }
        List<SysMenu> sysMenus=iSysMenuService.findByUserId(userId);
        //赋予权限
        for (SysMenu sysMenu : sysMenus) {
            List<String> per=Arrays.asList(sysMenu.getPerms().trim().split(","));
            for (String pers : per) {
                System.out.println("权限："+pers);
                info.addStringPermission(pers);
            }
        }

        return info;
    }


    /**
     * 根据userId 清除当前session存在的用户的权限缓存
     * @param userIds 已经修改了权限的userId
     */
    public void clearUserAuthByUserId(List<Integer> userIds){
        if(null == userIds || userIds.size() == 0)	return ;
        //获取所有session
        Collection<Session> sessions = redisSessionDAO.getActiveSessions();
        //定义返回
        List<SimplePrincipalCollection> list = new ArrayList<SimplePrincipalCollection>();
        for (Session session:sessions){
            //获取session登录信息。
            Object obj = session.getAttribute(DefaultSubjectContext.PRINCIPALS_SESSION_KEY);
            if(null != obj && obj instanceof SimplePrincipalCollection){
                //强转
                SimplePrincipalCollection spc = (SimplePrincipalCollection)obj;
                //判断用户，匹配用户ID。
                obj = spc.getPrimaryPrincipal();
                if(null != obj && obj instanceof SysUser){
                    SysUser user = (SysUser) obj;
                    System.out.println("user:"+user);
                    //比较用户ID，符合即加入集合
                    if(null != user && userIds.contains(user.getUserId())){
                        list.add(spc);
                    }
                }
            }
        }
        RealmSecurityManager securityManager =
                (RealmSecurityManager) SecurityUtils.getSecurityManager();
        MyShiroRealm realm = (MyShiroRealm)securityManager.getRealms().iterator().next();
        for (SimplePrincipalCollection simplePrincipalCollection : list) {
            realm.clearCachedAuthorizationInfo(simplePrincipalCollection);
        }
    }
}
