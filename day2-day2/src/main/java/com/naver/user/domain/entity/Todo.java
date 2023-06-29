package com.naver.user.domain.entity;

public class Todo {
    private Integer id;
    private String content;
    private String createAt;
    private boolean checked;
    private Integer userId;
    private Integer heart;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getHeart() {
        return heart;
    }

    public void setHeart(Integer heart) {
        this.heart = heart;
    }

    public Todo(Integer id, String content, String createAt, boolean checked, Integer userId, Integer heart) {
        this.id = id;
        this.content = content;
        this.createAt = createAt;
        this.checked = checked;
        this.userId = userId;
        this.heart = heart;
    }
}
