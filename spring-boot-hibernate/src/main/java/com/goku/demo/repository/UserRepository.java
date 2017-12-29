package com.goku.demo.repository;

import com.goku.demo.entity.User;
import org.hibernate.transform.Transformers;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by nbfujx on 2017-12-15.
 */
public interface UserRepository extends CrudRepository<User, String> {
    User findById(String id);
    Long deleteById(Long id);
}
