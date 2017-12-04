package com.goku.demo.controller;

import com.goku.demo.model.UserWithBLOBs;

import java.util.List;

/**
 * Created by nbfujx on 2017-12-01.
 */
public interface UserController {
    List<UserWithBLOBs> selectByNickname(String name);
    List<UserWithBLOBs> selectByNickname2(String name);
}
