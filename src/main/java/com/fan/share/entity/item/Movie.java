package com.fan.share.entity.item;

import lombok.Data;

import java.sql.Timestamp;
import java.util.Arrays;

/**电影类
 * @author fanlu
 * @version 1.0
 * @date 2020/9/10 21:17
 */
@Data
public class Movie {

    // 唯一id
    private Long id;
    // 电影名
    private String name;
    // 英文名
    private String nameEnglish;
    // 导演
    private String director;
    // 演员表
    private String[] actors;
    // 电影标签
    private Long tagId;
    // 国家标签
    private Long contryId;
    // 上映时间
    private Timestamp showingTime;
    // 评分
    private Integer score;
    // 喜爱人数
    private Integer likes;
    // 不喜欢人数
    private Integer dislikes;

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

    public String getNameEnglish() {
        return nameEnglish;
    }

    public void setNameEnglish(String nameEnglish) {
        this.nameEnglish = nameEnglish;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public Long getContryId() {
        return contryId;
    }

    public void setContryId(Long contryId) {
        this.contryId = contryId;
    }

    public Timestamp getShowingTime() {
        return showingTime;
    }

    public void setShowingTime(Timestamp showingTime) {
        this.showingTime = showingTime;
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
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nameEnglish='" + nameEnglish + '\'' +
                ", director='" + director + '\'' +
                ", actors=" + Arrays.toString(actors) +
                ", tagId=" + tagId +
                ", contryId=" + contryId +
                ", showingTime=" + showingTime +
                ", score=" + score +
                ", likes=" + likes +
                ", dislikes=" + dislikes +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
