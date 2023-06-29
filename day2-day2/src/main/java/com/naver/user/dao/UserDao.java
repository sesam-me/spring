package com.naver.user.dao;

import com.naver.user.domain.entity.User;
import com.naver.user.domain.request.SignupRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class UserDao {
    private final JdbcTemplate jdbcTemplate;

    public UserDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    public User login(String id, String pw){
        String sql = "select id, username, password, name, create_at as createAt" +
                " from users where username = ? and password = ?";
//        jdbcTemplate.queryForObject(sql, getUserRowMapper(), id, pw);
        return jdbcTemplate.queryForObject(sql, new UserRowMapper(), id, pw);
    }

    private RowMapper<User> getUserRowMapper() {
        return (rs, rowNum) -> {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setName(rs.getString("name"));
            return user;
        };
    }

    public Integer signup(SignupRequest request){
        String sql = "insert into users(username, password, name) values (?,?,?)";
        return jdbcTemplate.update(sql
                , request.getId(), request.getPw(), request.getName());
    }



}
