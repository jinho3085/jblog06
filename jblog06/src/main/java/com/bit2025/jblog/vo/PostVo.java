package com.bit2025.jblog.vo;

import java.util.Date;

public class PostVo {
    private int id;            // post.id (PK)
    private String title;      // post.title
    private String contents;   // post.contents
    private Date regDate;      // post.reg_date
    private int categoryId;    // post.category_id (FK → category.id)

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }
    public void setContents(String contents) {
        this.contents = contents;
    }

    public Date getRegDate() {
        return regDate;
    }
    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public int getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "PostVo [id=" + id + ", title=" + title + ", contents=" + contents + ", regDate=" + regDate
                + ", categoryId=" + categoryId + "]";
    }
}
