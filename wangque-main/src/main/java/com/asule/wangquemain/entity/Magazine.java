package com.asule.wangquemain.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Magazine {
    private Long id;

    private Long index;

    private String image;

    private String title;

    private Integer type;

    private Date pubdate;

    private Integer favNums;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getPubdate() {
        return pubdate;
    }

    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }

    public Integer getFavNums() {
        return favNums;
    }

    public void setFavNums(Integer favNums) {
        this.favNums = favNums;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", index=").append(index);
        sb.append(", image=").append(image);
        sb.append(", title=").append(title);
        sb.append(", type=").append(type);
        sb.append(", pubdate=").append(pubdate);
        sb.append(", favNums=").append(favNums);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }
}