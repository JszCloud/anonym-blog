package cn.name168.anonym.blog.admin.controller;


import cn.name168.anonym.blog.admin.common.controller.BaseController;
import cn.name168.anonym.blog.bean.entity.SysUser;
import cn.name168.anonym.blog.service.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import cn.name168.anonym.blog.admin.common.controller.BaseController;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 * 系统用户 前端控制器
 * </p>
 *
 * @author Mr.Li   ℗Hide-Community
 * @since 2018-05-19
 */
@Controller
@RequestMapping("/blog/sysUser")
public class SysUserController extends BaseController {

    @Autowired
    ISysUserService iSysUserService;

    @RequestMapping("find")
    @ResponseBody
    public SysUser findAll(){
        //return iSysUserService.findAll();
        return iSysUserService.findByUsername("admin");
    }
}

