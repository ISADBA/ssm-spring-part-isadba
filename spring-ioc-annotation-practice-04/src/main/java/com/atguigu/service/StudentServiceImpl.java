package com.atguigu.service;

import com.atguigu.dao.StudentDao;
import com.atguigu.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: StudentServiceImpl
 * Package: com.atguigu.service
 * Description:
 *
 * @Author: fenghao
 * @Create 2023/12/6 22:17
 * @Version 1.0
 */
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentDao studentDaoImpl;
    @Override
    public List<Student> findAll() {
        List<Student> studentList = studentDaoImpl.queryAll();
        System.out.println("service");
        return studentList;
    }
}
