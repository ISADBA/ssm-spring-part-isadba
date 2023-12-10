package com.atguigu.controller;

import com.atguigu.pojo.Student;
import com.atguigu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * ClassName: StudentController
 * Package: com.atguigu.controller
 * Description:
 *
 * @Author: fenghao
 * @Create 2023/12/6 22:12
 * @Version 1.0
 */
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

   public void findAll(){
       List<Student> all = studentService.findAll();
       System.out.println("all = " + all);
   }
}
