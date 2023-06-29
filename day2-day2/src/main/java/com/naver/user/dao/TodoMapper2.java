package com.naver.user.dao;

import com.naver.user.domain.dto.Update;
import com.naver.user.domain.entity.TodoJoinUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodoMapper2 {
    List<TodoJoinUser> findAll();
    List<TodoJoinUser> findByKeyword(String keyword);
    int update(Update update);
}
