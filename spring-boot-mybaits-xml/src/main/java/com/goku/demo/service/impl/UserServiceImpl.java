package com.goku.demo.service.impl;

import com.goku.demo.mapper.UserMapper;
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
    UserMapper userMapper;

    @Override
    public UserWithBLOBs selectByPrimaryKey(String id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
