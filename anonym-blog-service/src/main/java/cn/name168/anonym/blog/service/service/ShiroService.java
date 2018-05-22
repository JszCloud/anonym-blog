package cn.name168.anonym.blog.service.service;

import java.util.Set;

/**
 * Created by Nominal on 2018/5/22 0022.
 * 微博：@Mr丶Li_Anonym
 */
public interface ShiroService {
    /**
     * 获取用户权限列表
     */
    Set<String> getUserPermissions(Long userId);
}
