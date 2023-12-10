package com.atguigu.service.impl;

import com.atguigu.dao.StudentDao;
import com.atguigu.dao.impl.StudentDaoImpl;
import com.atguigu.pojo.Student;
import com.atguigu.service.StudentService;
import org.aspectj.weaver.ast.Var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: StudentServiceImpl
 * Package: com.atguigu.service.impl
 * Description:
 *
 * @Author: fenghao
 * @Create 2023/12/7 19:59
 * @Version 1.0
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDaoImpl;
    @Override
    public List<Student> findAll() {
        List<Student> studentList = studentDaoImpl.findAll();
        return studentList;
    }
}
