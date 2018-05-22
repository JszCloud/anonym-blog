package cn.name168.anonym.blog.service.service;


import cn.name168.anonym.blog.bean.entity.SysUser;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 系统用户 服务类
 * </p>
 *
 * @author Mr.Li   ℗Hide-Community
 * @since 2018-05-19
 */
public interface ISysUserService extends BaseService<SysUser> {
    List<SysUser> findAll();

    /**
     * 用户名查询用户
     * @param username
     * @return
     */
    SysUser findByUsername(String username);
}
