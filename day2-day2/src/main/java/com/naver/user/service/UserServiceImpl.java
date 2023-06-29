package com.naver.user.service;

import com.naver.user.dao.UserDao;
import com.naver.user.dao.UserMapper;
import com.naver.user.dao.UserMapper2;
import com.naver.user.domain.entity.User;
import com.naver.user.domain.request.LoginRequest;
import com.naver.user.domain.request.SignupRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    List<User> users = new ArrayList<>();

//    public UserServiceImpl() {
//        users.add(new User("id","123"));
//        users.add(new User("id1","123"));
//    }
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserMapper2 userMapper;
    @Override
    public User login(LoginRequest request) {
        try {
            return userMapper.login(request);
        }catch (Exception e){
            return null;
        }

    }

    @Override
    public boolean signup(SignupRequest request) {
        return userMapper.signup(request) != 0;
    }
}
