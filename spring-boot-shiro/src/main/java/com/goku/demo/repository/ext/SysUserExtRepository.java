package com.goku.demo.repository.ext;

import com.goku.demo.entity.SysUser;

/**
 * @author nbfujx
 */
public interface SysUserExtRepository {
    SysUser getSysUserWithRoleAndMenu(String userid);
}
