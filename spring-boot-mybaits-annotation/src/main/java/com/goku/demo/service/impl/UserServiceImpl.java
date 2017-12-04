package com.goku.demo.service.impl;

import com.goku.demo.mapper.UserMapper;
import com.goku.demo.model.UserWithBLOBs;
import com.goku.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by nbfujx on 2017-12-01.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserWithBLOBs> selectByNickname(String name) {
        return userMapper.selectByNickname(name);
    }

    @Override
    public List<UserWithBLOBs> selectByNickname2(String name) {
        return userMapper.selectByNickname2(name);
    }
}
