package com.naver.user.service;

import com.naver.user.domain.entity.User;
import com.naver.user.domain.request.LoginRequest;
import com.naver.user.domain.request.SignupRequest;

public interface UserService {
    User login(LoginRequest request);
    boolean signup(SignupRequest request);
}
