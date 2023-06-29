package com.naver.user.dao;

import com.naver.user.domain.entity.TodoJoinUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Component
public class TodoDao {

    private final JdbcTemplate jdbcTemplate;
    public TodoDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<TodoJoinUser> findAll(){
        String sql = "select\n" +
                "    t.id,\n" +
                "    t.create_at ,\n" +
                "    t.content,\n" +
                "    t.checked,\n" +
                "    u.name,\n" +
                "    u.id uid\n" +
                "from todos.todos as t\n" +
                "inner join todos.users as u\n" +
                "    on t.user_id = u.id";
        List<TodoJoinUser> todoJoinUsers = jdbcTemplate.query(sql, getTodoJoinUserRowMapper()
        );

        return todoJoinUsers;
    }

    private RowMapper<TodoJoinUser> getTodoJoinUserRowMapper() {
        return (rs, rowNum) ->
                new TodoJoinUser(
                        rs.getInt("id"),
                        rs.getString("content"),
                        rs.getString("create_at"),
                        rs.getBoolean("checked"),
                        rs.getString("name"),
                        rs.getInt("uid"),
                        null
                );
    }

    public int insert(Integer uid, String content){
        String sql = "insert into todos(user_id, content, checked) " +
                "values(?, ?, false)";
        // 컨텐츠가 필요, 유저 id가 필요하다.
        try {
            return jdbcTemplate.update(sql,uid,content);
        }catch (Exception e) {
            return 0;
        }

    }
    public List<TodoJoinUser> findByKeyword(String keyword){
        String sql = "select\n" +
                "    t.id,\n" +
                "    t.create_at ,\n" +
                "    t.content,\n" +
                "    t.checked,\n" +
                "    u.name,\n" +
                "    u.id uid\n" +
                "from todos.todos as t\n" +
                "inner join todos.users as u\n" +
                "    on t.user_id = u.id ";
        if(keyword!= null && !keyword.equals("")) {
            sql += "where content like ?";
        }
        List<TodoJoinUser> todoJoinUsers = jdbcTemplate.query(
                sql
                , getTodoJoinUserRowMapper()
                , "%" + keyword + "%"
        );

        return todoJoinUsers;
    }
}
