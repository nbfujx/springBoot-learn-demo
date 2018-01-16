package com.goku.demo.repository.impl;

import com.goku.demo.repository.UserExtRepository;
import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.HashMap;
import java.util.List;

/**
 * Created by nbfujx on 2018-01-03.
 */
@Repository
public class UserExtRepositoryImpl implements UserExtRepository {

    @Autowired
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<HashMap<String, String>> getUserInfo(String id) {
        String sql="select id,password_ from user_";
        Query query=entityManager.createNativeQuery(sql);
        query.unwrap(SQLQuery.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
        List rows = query.getResultList();
        return rows;
    }
}
