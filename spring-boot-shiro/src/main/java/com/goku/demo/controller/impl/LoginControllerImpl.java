package com.goku.demo.controller.impl;

import com.alibaba.fastjson.JSONObject;
import com.goku.demo.controller.LoginController;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author root
 */
@RestController
public class LoginControllerImpl implements LoginController {


    /**
     * 登录方法
     * @param name
     * @param password
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String ajaxLogin(String name,String password) {
        JSONObject jsonObject = new JSONObject();
        Subject subject = SecurityUtils.getSubject();
        String passwordmd5 = new Md5Hash(password, "2").toString();
        UsernamePasswordToken token = new UsernamePasswordToken(name,passwordmd5);
        try {
            subject.login(token);
            jsonObject.put("token", subject.getSession().getId());
            jsonObject.put("msg", "登录成功");
        } catch (IncorrectCredentialsException e) {
            jsonObject.put("msg", "密码错误");
        } catch (AuthenticationException e) {
            jsonObject.put("msg", "该用户不存在");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonObject.toString();
    }

    /**
     * 未登录，shiro应重定向到登录界面，此处返回未登录状态信息由前端控制跳转页面
     * @return
     */
    @RequestMapping(value = "/notAuthc")
    @ResponseBody
    public Object unAuthc() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", "1000000");
        jsonObject.put("msg", "未登录");
        return jsonObject.toString();
    }
}
