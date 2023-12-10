package com.atguigu.service;

import com.atguigu.pojo.Student;

import java.util.List;

/**
 * ClassName: StudentService
 * Package: com.atguigu.service
 * Description:
 *
 * @Author: fenghao
 * @Create 2023/12/4 08:35
 * @Version 1.0
 */
public interface StudentService {
    // 查询所有学员数据
    List<Student> findAll();
}
