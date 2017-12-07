package com.goku.demo.service;

import com.goku.demo.config.DataSource;
import com.goku.demo.model.UserWithBLOBs;

/**
 * Created by nbfujx on 2017-12-01.
 */
public interface UserService {

    @DataSource("one")
    UserWithBLOBs selectByPrimaryKey1(String id);
    @DataSource("two")
    UserWithBLOBs selectByPrimaryKey2(String id);
}
