package com.goku.demo.repository;

import com.goku.demo.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author nbfujx
 */
public interface SysUserRepository extends JpaRepository<SysUser, String> {

     SysUser findById(String id);
     SysUser findByUsername(String username);
}
