package com.fan.share.entity.item;

import java.sql.Timestamp;

/**电影标签类
 * @author fanlu
 * @version 1.0
 * @date 2020/9/10 21:27
 */
public class MovieTag {

    // 唯一id
    private Long id;
    // 标签名
    private String name;

    // 添加时间
    private Timestamp createTime;
    // 更新时间
    private Timestamp updateTime;

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

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "MovieTag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
