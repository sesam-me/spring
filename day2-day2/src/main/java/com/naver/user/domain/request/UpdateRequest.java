package com.naver.user.domain.request;

import com.naver.user.domain.dto.Update;

public class UpdateRequest {

    private final int id;
    private final String content;

    public UpdateRequest(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
    public Update toDto(int uid){
        return new Update(id, uid, content);
    }
}
