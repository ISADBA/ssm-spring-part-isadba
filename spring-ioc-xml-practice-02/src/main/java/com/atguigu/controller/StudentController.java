package com.atguigu.controller;

import com.atguigu.pojo.Student;
import com.atguigu.service.StudentService;

import java.util.List;

/**
 * ClassName: StudentController
 * Package: com.atguigu.controller
 * Description:
 *
 * @Author: fenghao
 * @Create 2023/12/4 08:40
 * @Version 1.0
 */
public class StudentController {
    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }
    public void findAll() {
        List<Student> all = studentService.findAll();
        System.out.println("studentController: " + all  );

    }
}
