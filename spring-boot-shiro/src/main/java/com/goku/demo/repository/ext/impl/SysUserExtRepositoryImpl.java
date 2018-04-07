package com.goku.demo.repository.ext.impl;

import com.goku.demo.entity.SysUser;
import com.goku.demo.repository.ext.SysUserExtRepository;
import org.hibernate.SQLQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * @author nbfujx
 */
@Repository
public class SysUserExtRepositoryImpl implements SysUserExtRepository {

    @Autowired
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public SysUser getSysUserWithRoleAndMenu(String userid) {
        String sql="SELECT u FROM SysUser u " +
                "left join fetch u.sysRoles s left join fetch s.sysMenus rm " +
                "left join fetch u.sysMenus m where u.id=:userid";
        Query query=entityManager.createQuery(sql).setParameter("userid",userid);
        SysUser sysUser= (SysUser) query.getSingleResult();
        return sysUser;
    }
}
