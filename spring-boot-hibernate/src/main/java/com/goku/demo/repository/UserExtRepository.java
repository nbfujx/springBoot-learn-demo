package com.goku.demo.repository;

import java.util.HashMap;
import java.util.List;

/**
 * Created by nbfujx on 2018-01-03.
 */
public interface UserExtRepository {
    List<HashMap<String,String>> getUserInfo(String id);
}
