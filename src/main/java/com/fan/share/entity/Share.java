package com.fan.share.entity;

import java.sql.Timestamp;

/**分享表
 * @author fanlu
 * @version 1.0
 * @date 2020/9/10 21:55
 */
public class Share {
    // 唯一id
    private Long id;
    // 用户id
    private Long userId;
    // 分享类型id
    private Long typeId;
    // 分享物品的id
    private Long itemId;

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

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
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
        return "Share{" +
                "id=" + id +
                ", userId=" + userId +
                ", typeId=" + typeId +
                ", itemId=" + itemId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
