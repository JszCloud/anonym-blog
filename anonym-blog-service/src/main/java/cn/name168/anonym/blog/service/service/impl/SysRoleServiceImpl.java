package cn.name168.anonym.blog.service.service.impl;

import cn.name168.anonym.blog.bean.entity.SysRole;
import cn.name168.anonym.blog.service.mapper.SysRoleMapper;
import cn.name168.anonym.blog.service.service.ISysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 角色 服务实现类
 * </p>
 *
 * @author Mr.Li   ℗Hide-Community
 * @since 2018-05-19
 */
@Service
public class SysRoleServiceImpl implements ISysRoleService {
    @Autowired
    SysRoleMapper sysRoleMapper;

    /**
     * 根据用户id查询角色列表
     * @param userId
     * @return
     */
    @Override
    public List<SysRole> findByUserId(Long userId) {
        return sysRoleMapper.selectByUserId(userId);
    }

    /**
     * 添加
     *
     * @param sysRole
     * @return
     */
    @Override
    public Integer save(SysRole sysRole) {
        return null;
    }

    /**
     * 删除
     *
     * @param sysRole
     * @return
     */
    @Override
    public Integer romove(SysRole sysRole) {
        return null;
    }

    /**
     * 修改
     *
     * @param sysRole
     * @return
     */
    @Override
    public Integer edit(SysRole sysRole) {
        return null;
    }
}
