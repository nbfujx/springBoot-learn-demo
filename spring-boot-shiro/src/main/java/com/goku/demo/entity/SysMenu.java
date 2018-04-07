package com.goku.demo.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "sys_menu", schema = "goku_coredb", catalog = "")
public class SysMenu {
    private String id;
    private String moduleId;
    private String name;
    private String parentId;
    private String isparent;
    private Integer sort;
    private String icon;
    private String description;
    private String ifShow;
    private String isLeaf;
    private String permission;
    private String url;


    @Id
    @Column(name = "id", nullable = false, length = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "module_id", nullable = true, length = 32)
    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 25)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "parent_id", nullable = true, length = 32)
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "isparent", nullable = true, length = 5)
    public String getIsparent() {
        return isparent;
    }

    public void setIsparent(String isparent) {
        this.isparent = isparent;
    }

    @Basic
    @Column(name = "sort", nullable = true)
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Basic
    @Column(name = "icon", nullable = true, length = 50)
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 500)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "if_show", nullable = true, length = 1)
    public String getIfShow() {
        return ifShow;
    }

    public void setIfShow(String ifShow) {
        this.ifShow = ifShow;
    }

    @Basic
    @Column(name = "is_leaf", nullable = true, length = 1)
    public String getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(String isLeaf) {
        this.isLeaf = isLeaf;
    }

    @Basic
    @Column(name = "permission", nullable = true, length = 255)
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Basic
    @Column(name = "url", nullable = true, length = 255)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysMenu sysMenu = (SysMenu) o;

        if (id != null ? !id.equals(sysMenu.id) : sysMenu.id != null) return false;
        if (moduleId != null ? !moduleId.equals(sysMenu.moduleId) : sysMenu.moduleId != null) return false;
        if (name != null ? !name.equals(sysMenu.name) : sysMenu.name != null) return false;
        if (parentId != null ? !parentId.equals(sysMenu.parentId) : sysMenu.parentId != null) return false;
        if (isparent != null ? !isparent.equals(sysMenu.isparent) : sysMenu.isparent != null) return false;
        if (sort != null ? !sort.equals(sysMenu.sort) : sysMenu.sort != null) return false;
        if (icon != null ? !icon.equals(sysMenu.icon) : sysMenu.icon != null) return false;
        if (description != null ? !description.equals(sysMenu.description) : sysMenu.description != null) return false;
        if (ifShow != null ? !ifShow.equals(sysMenu.ifShow) : sysMenu.ifShow != null) return false;
        if (isLeaf != null ? !isLeaf.equals(sysMenu.isLeaf) : sysMenu.isLeaf != null) return false;
        if (permission != null ? !permission.equals(sysMenu.permission) : sysMenu.permission != null) return false;
        if (url != null ? !url.equals(sysMenu.url) : sysMenu.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (moduleId != null ? moduleId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (isparent != null ? isparent.hashCode() : 0);
        result = 31 * result + (sort != null ? sort.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (ifShow != null ? ifShow.hashCode() : 0);
        result = 31 * result + (isLeaf != null ? isLeaf.hashCode() : 0);
        result = 31 * result + (permission != null ? permission.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }
}
