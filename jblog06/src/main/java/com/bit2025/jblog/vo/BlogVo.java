package com.bit2025.jblog.vo;

public class BlogVo {
    private String blogId;   // blog.blog_id (PK, FK → user.id)
    private String title;    // blog.title
    private String profile;  // blog.profile

    public String getBlogId() {
        return blogId;
    }
    public void setBlogId(String blogId) {
        this.blogId = blogId;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getProfile() {
        return profile;
    }
    public void setProfile(String profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "BlogVo [blogId=" + blogId + ", title=" + title + ", profile=" + profile + "]";
    }
}
