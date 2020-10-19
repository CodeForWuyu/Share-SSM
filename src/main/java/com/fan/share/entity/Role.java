package com.fan.share.entity;

/**
 * @author fanlu
 * @version 1.0
 * @date 2020/9/2 8:50
 */
public class Role {
    // 唯一id
    private Long id;
    // 名称
    private String name;
    // 描述
    private String desc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    

}
