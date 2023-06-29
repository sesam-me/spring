package com.naver.config;


import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

import javax.sql.DataSource;

//@Configuration
public class MybatisConfig {
//    private final DataSource dataSource;

//    public MybatisConfig(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }

//    private final String url = "jdbc:mysql://localhost:3306/todos" +
//            "?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
//    private final String username = "root";
//    private final String password = "1q2w3e4r!!";
//    @Bean
//    public DataSource dataSource(){
//        BasicDataSource dataSource = new BasicDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUrl(url);
//        dataSource.setUsername(username);
//        dataSource.setPassword(password);
//        return dataSource;
//    }
//    @Bean
//    public SqlSessionFactoryBean sessionFactoryBean(){
//        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
//        factoryBean.setConfigLocation(
//                new FileSystemResource("classpath:/config/mybatisConfig.xml"));
//        factoryBean.setMapperLocations(
//                new FileSystemResource("classpath:/sqlMap/*.xml"));
//        factoryBean.setDataSource(dataSource);
//        return factoryBean;
//    }
//    @Bean
//    public SqlSessionTemplate sqlSessionTemplate(){
//        return new SqlSessionTemplate((SqlSessionFactory) sessionFactoryBean());
//    }
}
