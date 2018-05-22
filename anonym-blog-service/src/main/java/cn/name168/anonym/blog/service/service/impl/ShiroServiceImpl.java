package cn.name168.anonym.blog.service.service.impl;

import cn.name168.anonym.blog.bean.entity.SysMenu;
import cn.name168.anonym.blog.service.mapper.SysMenuMapper;
import cn.name168.anonym.blog.service.service.ShiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by Nominal on 2018/5/22 0022.
 * 微博：@Mr丶Li_Anonym
 */
@Service
public class ShiroServiceImpl implements ShiroService {

    @Autowired
    SysMenuMapper sysMenuMapper;
    /**
     * 获取用户权限列表
     *
     * @param userId
     */
    @Override
    public Set<String> getUserPermissions(Long userId) {
        List<String> permsList;

        //系统管理员，拥有最高权限
            List<SysMenu> menuList = sysMenuMapper.selectAll();
            permsList = new ArrayList<>(menuList.size());
            for(SysMenu menu : menuList){
                permsList.add(menu.getPerms());
            }

        //用户权限列表
        Set<String> permsSet = new HashSet<>();
        for(String perms : permsList){

            permsSet.addAll(Arrays.asList(perms.trim().split(",")));
        }
        return permsSet;
    }
}
