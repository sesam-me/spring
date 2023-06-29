package com.naver.user.service;

import com.naver.user.domain.entity.User;
import com.naver.user.domain.request.LoginRequest;
import com.naver.user.domain.request.SignupRequest;
import com.naver.user.domain.request.UpdateRequest;

public interface UserService {
    User login(LoginRequest request);
    boolean signup(SignupRequest request);

    boolean update(UpdateRequest request);
}
