package com.goku.demo.controller.impl;

import com.goku.demo.controller.UserController;
import com.goku.demo.model.UserWithBLOBs;
import com.goku.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nbfujx on 2017-12-01.
 */
@RestController
@RequestMapping("/User")
public class UserControllerImpl implements UserController {

    @Autowired
    @Qualifier("UserService_one")
    UserService userservice;

    @Override
    @RequestMapping("/{id}")
    public UserWithBLOBs selectByPrimaryKey1(@PathVariable String id) {
        return userservice.selectByPrimaryKey1(id);
    }

    @Override
    @RequestMapping("/2/{id}")
    public UserWithBLOBs selectByPrimaryKey2(@PathVariable String id) {
        return userservice.selectByPrimaryKey2(id);
    }
}
