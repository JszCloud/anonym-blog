package cn.name168.anonym.blog.api.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Nominal on 2018/5/24 0024.
 * 微博：@Mr丶Li_Anonym
 */
@RestController
@RequestMapping("/test")
public class TsetController {

    @ApiOperation(value = "测试哦",notes = "测试")
    @RequestMapping("/{id}")
    public String test(@ApiParam("第几页") @PathVariable(name = "id", required = false) String id, @ApiParam("第几页") @RequestParam(name = "user", required = false) String user, @ApiParam("第几页") @RequestParam(name = "page", required = false) Integer page){
        return "success"+id+user+page;
    };
}
