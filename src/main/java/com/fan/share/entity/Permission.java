package com.fan.share.entity;

/**
 * @author fanlu
 * @version 1.0
 * @date 2020/9/2 8:52
 */
public class Permission {
    // 唯一id
    private Long id;
    // 角色id
    private Long roleId;
    // 权限名称
    private String name;
    // 权限描述
    private String desc;
    // 权限内容
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
