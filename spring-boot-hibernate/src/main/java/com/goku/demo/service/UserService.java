package com.goku.demo.service;

import com.goku.demo.entity.User;

import java.util.List;
import java.util.Map;

/**
 * Created by nbfujx on 2017-12-15.
 */
public interface UserService {
     List<User> getUserList();
     User findUserById(String id);
     void save(User user);
     void edit(User user);
     void delete(String id);
}
