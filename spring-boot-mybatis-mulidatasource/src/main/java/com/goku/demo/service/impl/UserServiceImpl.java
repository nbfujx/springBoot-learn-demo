package com.goku.demo.service.impl;

import com.goku.demo.mapper.one.UserOneMapper;
import com.goku.demo.mapper.two.UserTwoMapper;
import com.goku.demo.model.UserWithBLOBs;
import com.goku.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by nbfujx on 2017-12-01.
 */
@Service("UserService_one")
public class UserServiceImpl implements UserService {

    @Autowired
    UserTwoMapper userTwoMapper;

    @Autowired
    UserOneMapper userOneMapper;


    @Override
    public UserWithBLOBs selectByPrimaryKey1(String id) {
        return userOneMapper.selectByPrimaryKey(id);
    }

    @Override
    public UserWithBLOBs selectByPrimaryKey2(String id) {
        return userTwoMapper.selectByPrimaryKey(id);
    }
}
