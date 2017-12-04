package com.goku.demo.controller.impl;

import com.goku.demo.controller.UserController;
import com.goku.demo.model.UserWithBLOBs;
import com.goku.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by nbfujx on 2017-12-01.
 */
@RestController
@RequestMapping("/User")
public class UserControllerImpl implements UserController {

    @Autowired
    UserService userservice;

    @Override
    @RequestMapping("/one/{name}")
    public List<UserWithBLOBs> selectByNickname(@PathVariable String name) {
        return userservice.selectByNickname(name);
    }

    @Override
    @RequestMapping("/two/{name}")
    public List<UserWithBLOBs> selectByNickname2(@PathVariable  String name) {
        return userservice.selectByNickname2(name);
    }
}
