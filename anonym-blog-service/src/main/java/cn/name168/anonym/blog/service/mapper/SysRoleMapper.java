package cn.name168.anonym.blog.service.mapper;


import cn.name168.anonym.blog.bean.entity.SysRole;
import cn.name168.anonym.blog.bean.entity.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 角色 Mapper 接口
 * </p>
 *
 * @author Mr.Li   ℗Hide-Community
 * @since 2018-05-19
 */
@Repository
public interface SysRoleMapper {
    List<SysRole> selectByUserId(Long userId);

}
