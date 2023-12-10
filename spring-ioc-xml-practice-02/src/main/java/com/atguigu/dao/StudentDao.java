package com.atguigu.dao;

import com.atguigu.pojo.Student;

import java.util.List;

/**
 * ClassName: StudentDao
 * Package: com.atguigu.dao
 * Description:
 *
 * @Author: fenghao
 * @Create 2023/12/3 21:48
 * @Version 1.0
 */
public interface StudentDao {
    /**
     * 数据库查询全部学生数据
     * @return
     */
    List<Student> queryAll();
}
