package com.atguigu.service;

import com.atguigu.pojo.Student;

import java.util.List;

/**
 * ClassName: StudentService
 * Package: com.atguigu.service
 * Description:
 *
 * @Author: fenghao
 * @Create 2023/12/7 19:59
 * @Version 1.0
 */
public interface StudentService {
    List<Student> findAll();
}
