package com.fan.share.entity;

import java.sql.Timestamp;

/** 关注表
 * @author fanlu
 * @version 1.0
 * @date 2020/9/10 21:57
 */
public class Follow {
    // 唯一id
    private Long id;
    // 用户id
    private Long userId;
    // 被关注用户id
    private Long followId;

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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getFollowId() {
        return followId;
    }

    public void setFollowId(Long followId) {
        this.followId = followId;
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
        return "Follow{" +
                "id=" + id +
                ", userId=" + userId +
                ", followId=" + followId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
