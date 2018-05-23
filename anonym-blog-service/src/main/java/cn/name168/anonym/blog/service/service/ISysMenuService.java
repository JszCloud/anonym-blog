package cn.name168.anonym.blog.service.service;


import cn.name168.anonym.blog.bean.entity.SysMenu;

import java.util.List;

/**
 * <p>
 * 菜单管理 服务类
 * </p>
 *
 * @author Mr.Li   ℗Hide-Community
 * @since 2018-05-19
 */
public interface ISysMenuService extends BaseService<SysMenu> {
    /**
     * 根据用户id查找资源
     * @param userId
     * @return
     */
    List<SysMenu> findByUserId(Long userId);

    /**
     * 查询所有权限
     * @return
     */
    List<SysMenu> findAll();
}
