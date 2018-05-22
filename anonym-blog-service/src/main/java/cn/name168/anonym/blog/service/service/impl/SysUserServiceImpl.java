package cn.name168.anonym.blog.service.service.impl;

import cn.name168.anonym.blog.bean.entity.SysUser;
import cn.name168.anonym.blog.service.mapper.SysUserMapper;
import cn.name168.anonym.blog.service.service.ISysUserService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 * @author Mr.Li   ℗Hide-Community
 * @since 2018-05-19
 */
@Service
public class SysUserServiceImpl implements ISysUserService {

    @Autowired
    SysUserMapper sysUserMapper;
    @Override
    public List<SysUser> findAll() {

        List<SysUser> userList=sysUserMapper.selectPage(
                new Page<SysUser>(1,10),
                new EntityWrapper<SysUser>().eq("username","admin")
        );
        return userList;
    }

    /**
     * 用户名查询用户
     *
     * @param username
     * @return
     */
    @Override
    public SysUser findByUsername(String username) {

        return sysUserMapper.selectByName(username);
    }

    /**
     * 添加
     *
     * @param sysUser
     * @return
     */
    @Override
    public Integer save(SysUser sysUser) {
        return null;
    }

    /**
     * 删除
     *
     * @param sysUser
     * @return
     */
    @Override
    public Integer romove(SysUser sysUser) {
        return null;
    }

    /**
     * 修改
     *
     * @param sysUser
     * @return
     */
    @Override
    public Integer edit(SysUser sysUser) {
        return null;
    }
}
