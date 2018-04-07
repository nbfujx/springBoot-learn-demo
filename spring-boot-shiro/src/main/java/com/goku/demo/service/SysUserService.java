package com.goku.demo.service;

import com.goku.demo.common.po.UserPermissionPO;
import com.goku.demo.common.po.UserRolePO;
import com.goku.demo.entity.SysUser;

import java.util.List;
import java.util.Set;

/**
 * @author root
 */
public interface SysUserService {

    /**
     * 获取用户信息
     * @param userId
     * @return
     */
    SysUser getSysUser(String userId);

    /**
     * 获取用户信息
     * @param username
     * @return
     */
    SysUser getSysUserByUsername(String username);

    /**
     * 获取用户角色信息
     * @param sysUser
     * @return
     */
    Set<UserRolePO> listUserRolePO(SysUser sysUser) ;

    /**
     *获取用户权限信息
     * @param sysUser
     * @return
     */
    Set<UserPermissionPO> listUserPermissionPO(SysUser sysUser);
}
