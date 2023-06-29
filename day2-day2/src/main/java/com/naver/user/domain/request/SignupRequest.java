package com.naver.user.domain.request;

public class SignupRequest {
    private String id;
    private String pw;
    private String name;

    public SignupRequest(String id, String pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
    }

    public SignupRequest() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
