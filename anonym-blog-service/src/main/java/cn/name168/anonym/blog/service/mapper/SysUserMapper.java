package cn.name168.anonym.blog.service.mapper;


import cn.name168.anonym.blog.bean.entity.SysUser;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 系统用户 Mapper 接口
 * </p>
 *
 * @author Mr.Li   ℗Hide-Community
 * @since 2018-05-19
 */
@Mapper
@Repository
public interface SysUserMapper extends BaseMapper<SysUser>{
    SysUser selectByName(String username);
}
