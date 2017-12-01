package com.goku.demo.service;

import com.goku.demo.model.UserWithBLOBs;

/**
 * Created by nbfujx on 2017-12-01.
 */
public interface UserService {
    UserWithBLOBs selectByPrimaryKey(String id);
}
