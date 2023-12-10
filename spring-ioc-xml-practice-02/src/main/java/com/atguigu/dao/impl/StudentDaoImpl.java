package com.atguigu.dao.impl;


import com.atguigu.dao.StudentDao;
import com.atguigu.pojo.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * ClassName: StudentDaoImpl
 * Package: com.atguigu.dao.impl
 * Description:
 *
 * @Author: fenghao
 * @Create 2023/12/3 21:49
 * @Version 1.0
 */
public class StudentDaoImpl implements StudentDao {
    private JdbcTemplate jdbcTemplate;
    // 注入jdbcTemplate
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    // 数据库查询所有学生数据
    @Override
    public List<Student> queryAll() {
        String sql = "select id,name,gender,age,class as classes  from students";
        List<Student> studentList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
        System.out.println("studentDao: " + studentList);
        return studentList;
    }
}
