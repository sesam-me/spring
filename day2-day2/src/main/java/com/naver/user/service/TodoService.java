package com.naver.user.service;

import com.naver.user.dao.TodoDao;
import com.naver.user.dao.TodoMapper;
import com.naver.user.dao.TodoMapper2;
import com.naver.user.domain.dto.Update;
import com.naver.user.domain.entity.TodoJoinUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private final TodoDao todoDao;
    private final TodoMapper2 todoMapper;

    public TodoService(TodoDao todoDao, TodoMapper2 todoMapper) {
        this.todoDao = todoDao;
        this.todoMapper = todoMapper;
    }

    public List<TodoJoinUser> findAll(){
        return todoMapper.findAll();
    }

    public int insert(Integer uid, String content){
        //Dao 에 있는 기능을 끌어올 예정.
        return todoDao.insert(uid,content);

    }
    public List<TodoJoinUser> findByKeyword(String keyword){
        if(keyword != null) keyword = "%"+keyword+"%";
        return todoMapper.findByKeyword(keyword);
//        todoDao.findByKeyword(keyword);
    }

    public int update(Update update){
        return todoMapper.update(update);
    }
}
