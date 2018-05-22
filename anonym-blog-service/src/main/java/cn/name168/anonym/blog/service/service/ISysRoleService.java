package cn.name168.anonym.blog.service.service;


import cn.name168.anonym.blog.bean.entity.SysRole;

import java.util.List;

/**
 * <p>
 * 角色 服务类
 * </p>
 *
 * @author Mr.Li   ℗Hide-Community
 * @since 2018-05-19
 */
public interface ISysRoleService extends BaseService<SysRole> {

    /**
     * 根据用户id查询角色列表
     * @param userId
     * @return
     */
    List<SysRole> findByUserId(Long userId);


}
