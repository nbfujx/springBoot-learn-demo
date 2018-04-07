package com.goku.demo.service.imp;

import com.goku.demo.common.po.UserPermissionPO;
import com.goku.demo.common.po.UserRolePO;
import com.goku.demo.entity.SysMenu;
import com.goku.demo.entity.SysRole;
import com.goku.demo.entity.SysUser;
import com.goku.demo.repository.SysUserRepository;
import com.goku.demo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author root
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    SysUserRepository sysUserRepository;

    @Override
    public SysUser getSysUser(String userId) {
        return sysUserRepository.findById(userId);
    }

    @Override
    public SysUser getSysUserByUsername(String username) {
        return sysUserRepository.findByUsername(username);
    }

    @Override
    public Set<UserRolePO> listUserRolePO(SysUser sysUser) {
        //SysUser sysUser = sysUserRepository.findById(userId);
        Set<UserRolePO> userRolePOS=new HashSet<UserRolePO>();
        Set<SysRole> sysRoles= sysUser.getSysRoles();
        Iterator<SysRole> it=sysRoles.iterator();
        while(it.hasNext())
        {
            SysRole sysRole=it.next();
            UserRolePO urpo=new UserRolePO();
            urpo.setUserId(sysUser.getId());
            urpo.setRoleId(sysRole.getKey());
            urpo.setRoleName(sysRole.getName());
            userRolePOS.add(urpo);
        }
        return userRolePOS;
    }

    @Override
    public Set<UserPermissionPO> listUserPermissionPO(SysUser sysUser) {
        //SysUser sysUser = sysUserRepository.findById(userId);
        Set<UserPermissionPO> userPermissionPOS=new HashSet<UserPermissionPO>();
        Set<SysMenu> sysMenus= sysUser.getSysMenus();
        Iterator<SysMenu> smit=sysMenus.iterator();
        while(smit.hasNext())
        {
            SysMenu sysMenu=smit.next();
            if(sysMenu.getPermission() != null && !sysMenu.getPermission().isEmpty()) {
                UserPermissionPO uppo = new UserPermissionPO();
                uppo.setUserId(sysUser.getId());
                uppo.setPermission(sysMenu.getPermission());
                userPermissionPOS.add(uppo);
            }
        }
        Set<SysRole> sysRoles= sysUser.getSysRoles();
        Iterator<SysRole> srit=sysRoles.iterator();
        while(srit.hasNext()) {
            SysRole sysRole = srit.next();
            Iterator<SysMenu> srmit = sysRole.getSysMenus().iterator();
            while (srmit.hasNext()) {
                SysMenu sysMenu=srmit.next();
                if(sysMenu.getPermission() != null && !sysMenu.getPermission().isEmpty()) {
                    UserPermissionPO uppo = new UserPermissionPO();
                    uppo.setUserId(sysUser.getId());
                    uppo.setPermission(sysMenu.getPermission());
                    userPermissionPOS.add(uppo);
                }
            }
        }
        return userPermissionPOS;
    }
}
