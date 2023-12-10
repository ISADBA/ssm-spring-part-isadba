package com.atguigu.service;

import com.atguigu.pojo.Student;

import java.sql.SQLOutput;
import java.util.List;

/**
 * ClassName: StudentService
 * Package: com.atguigu.service
 * Description:
 *
 * @Author: fenghao
 * @Create 2023/12/6 22:16
 * @Version 1.0
 */
public interface StudentService {
    List<Student> findAll();
}
