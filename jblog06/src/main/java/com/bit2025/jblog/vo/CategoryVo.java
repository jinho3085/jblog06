package com.bit2025.jblog.vo;

public class CategoryVo {
    private int id;             // category.id (PK)
    private String name;        // category.name
    private String description; // category.description
    private String blogId;      // category.blog_id (FK → blog.blog_id)

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getBlogId() {
        return blogId;
    }
    public void setBlogId(String blogId) {
        this.blogId = blogId;
    }

    @Override
    public String toString() {
        return "CategoryVo [id=" + id + ", name=" + name + ", description=" + description + ", blogId=" + blogId + "]";
    }
}
