package com.fan.share.entity.item;

import java.sql.Timestamp;

/**
 * @author fanlu
 * @version 1.0
 * @date 2020/9/10 21:29
 */
public class Book {
    // 唯一id
    private Long id;
    // 书名
    private String name;
    // 作者名
    private String author;
    // 译者名
    private String translator;
    // 书籍标签
    private Long tagId;
    // 国家id
    private Long countryId;
    // 出版社
    private String press;
    // 初版时间               
    private Timestamp pressTime;
    // 价格
    private Double price;
    // 评分
    private Integer score;
    // 喜爱值
    private Integer likes;
    // 厌恶值
    private Integer dislikes;
    // 创建日期
    private Timestamp createTime;
    // 更新日期
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public Timestamp getPressTime() {
        return pressTime;
    }

    public void setPressTime(Timestamp pressTime) {
        this.pressTime = pressTime;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getDislikes() {
        return dislikes;
    }

    public void setDislikes(Integer dislikes) {
        this.dislikes = dislikes;
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
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", translator='" + translator + '\'' +
                ", tagId=" + tagId +
                ", countryId=" + countryId +
                ", press='" + press + '\'' +
                ", pressTime=" + pressTime +
                ", price=" + price +
                ", score=" + score +
                ", likes=" + likes +
                ", dislikes=" + dislikes +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
