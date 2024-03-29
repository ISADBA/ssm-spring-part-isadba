package com.atguigu.service.impl;

import com.atguigu.dao.StudentDao;
import com.atguigu.pojo.Student;
import com.atguigu.service.StudentService;

import java.util.List;

/**
 * ClassName: StudentServiceImpl
 * Package: com.atguigu.service.impl
 * Description:
 *
 * @Author: fenghao
 * @Create 2023/12/4 08:36
 * @Version 1.0
 */
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> findAll() {
        List<Student> studentList = studentDao.queryAll();
        System.out.println("studentService: " + studentList);
        return studentList;
    }
}
