package com.naver.user.domain.dto;

public class Update {

    private int id;
    private int uid;
    private String content;

    public Update(int id, int uid, String content) {
        this.id = id;
        this.uid = uid;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
