package com.goku.demo.controller.impl;

import com.alibaba.fastjson.JSONObject;
import com.goku.demo.controller.SysUserController;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author root
 */
@RestController
@RequestMapping("/test")
public class SysUserControllerImpl implements SysUserController {

    /**
     * 未登录，shiro应重定向到登录界面，此处返回未登录状态信息由前端控制跳转页面
     * @return
     */
    @RequestMapping(value = "/hello")
    @ResponseBody
    @RequiresPermissions(value={"sys:user:roleauth"})
    public Object hello() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg", "hello word");
        return jsonObject.toString();
    }
}
