package com.goku.demo.controller;

import com.goku.demo.model.UserWithBLOBs;

/**
 * Created by nbfujx on 2017-12-01.
 */
public interface UserController {
    UserWithBLOBs selectByPrimaryKey(String id);
}
