package com.goku.demo.common.po;

/**
 * @author nbfujx
 */
public class UserPermissionPO {

    private String userId;
    private String permission;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getUserId() {
        return userId;
    }

    public String getPermission() {
        return permission;
    }
}
