package com.atguigu.dao;

import com.atguigu.pojo.Student;

import java.util.List;

/**
 * ClassName: StudentDao
 * Package: com.atguigu.dao
 * Description:
 *
 * @Author: fenghao
 * @Create 2023/12/7 19:56
 * @Version 1.0
 */
public interface StudentDao {
    List<Student> findAll();
}
