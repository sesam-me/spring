package com.naver.user.domain.entity;

public class TodoJoinUser {
    private Integer id;
    private String content;
    private String createAt;
    private boolean checked;
    private String name;
    private Integer uid;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getHeart() {
        return heart;
    }

    public void setHeart(Integer heart) {
        this.heart = heart;
    }

    public TodoJoinUser(Integer id, String content, String createAt, boolean checked, String name, Integer uid, Integer heart) {
        this.id = id;
        this.content = content;
        this.createAt = createAt;
        this.checked = checked;
        this.name = name;
        this.uid = uid;
        this.heart = heart;
    }
}
