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
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Set;

/**
 * Created by Nominal on 2018/5/21 0021.
 * 微博：@Mr丶Li_Anonym
 */
@Component
public class MyShiroRealm extends AuthorizingRealm {

    @Autowired
    ISysUserService iSysUserService;

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

        // principal参数使用用户Id，方便动态刷新用户权限
        return new SimpleAuthenticationInfo(
                user,
                user.getPassword(),
                getName());
    }

    /**
     * 权限认证，为当前登录的Subject授予角色和权限（角色的权限信息集合）
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("权限认证方法：MyShiroRealm.doGetAuthenticationInfo()");
        // 权限信息对象info,用来存放查出的用户的所有的角色（role）及权限（permission）
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        //Long userId = (Long) SecurityUtils.getSubject().getPrincipal();
        SysUser token = (SysUser)SecurityUtils.getSubject().getPrincipal();
        Long userId =token.getUserId();

        //用户权限列表
        Set<String> permsSet = shiroService.getUserPermissions(userId);

        info.addStringPermissions(permsSet);



        return info;
    }

}
