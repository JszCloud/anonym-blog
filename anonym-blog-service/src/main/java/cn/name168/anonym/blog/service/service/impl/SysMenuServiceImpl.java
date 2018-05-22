package cn.name168.anonym.blog.service.service.impl;

import cn.name168.anonym.blog.bean.entity.SysMenu;
import cn.name168.anonym.blog.service.mapper.SysMenuMapper;
import cn.name168.anonym.blog.service.service.ISysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 菜单管理 服务实现类
 * </p>
 *
 * @author Mr.Li   ℗Hide-Community
 * @since 2018-05-19
 */
@Service
public class SysMenuServiceImpl implements ISysMenuService {

    @Autowired
    SysMenuMapper sysMenuMapper;

    /**
     * 根据角色id查找资源
     *
     * @param roleId
     * @return
     */
    @Override
    public List<SysMenu> findByRoleId(Long roleId) {
        return sysMenuMapper.selectByRoleId(roleId);
    }

    /**
     * 查询所有权限
     *
     * @return
     */
    @Override
    public List<SysMenu> findAll() {
        return sysMenuMapper.selectAll();
    }

    /**
     * 添加
     *
     * @param sysMenu
     * @return
     */
    @Override
    public Integer save(SysMenu sysMenu) {
        return null;
    }

    /**
     * 删除
     *
     * @param sysMenu
     * @return
     */
    @Override
    public Integer romove(SysMenu sysMenu) {
        return null;
    }

    /**
     * 修改
     *
     * @param sysMenu
     * @return
     */
    @Override
    public Integer edit(SysMenu sysMenu) {
        return null;
    }
}
