package com.goku.demo.config.shiro;

import com.goku.demo.common.po.UserPermissionPO;
import com.goku.demo.common.po.UserRolePO;
import com.goku.demo.entity.SysUser;
import com.goku.demo.service.SysUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

/**
 * Created by nbfujx on 2017/11/7.
 */
public class ShiroRealm extends AuthorizingRealm {


    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SysUserService sysUserService;

    /**
     *权限验证
     * **/
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SysUser user = sysUserService.getSysUserByUsername((String) principalCollection.getPrimaryPrincipal());
        //把principals放session中 key=userId value=principals
        SecurityUtils.getSubject().getSession().setAttribute(String.valueOf(user.getId()),SecurityUtils.getSubject().getPrincipals());
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        Set<UserRolePO> urpos=sysUserService.listUserRolePO(user);
        Set<UserPermissionPO> uppos=sysUserService.listUserPermissionPO(user);
        //赋予角色
        for(UserRolePO userRole:urpos){
            this.logger.info(userRole.getRoleId());
            info.addRole(userRole.getRoleId());
        }
        //赋予权限
        for(UserPermissionPO userPermission:uppos){
            this.logger.info(userPermission.getPermission());
            info.addStringPermission(userPermission.getPermission());

        }

        return info;
    }

    /**
     * 登录验证
     * **/
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String userName=token.getUsername();
        SysUser user = sysUserService.getSysUserByUsername(token.getUsername());
        if (user != null) {
            //设置用户session
            Session session = SecurityUtils.getSubject().getSession();
            session.setAttribute("user", user);
            return new SimpleAuthenticationInfo(userName,user.getPassword(),getName());
        } else {
            return null;
        }
    }
}
