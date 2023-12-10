package com.atguigu.controller;

import com.atguigu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName: StudentController
 * Package: com.atguigu.controller
 * Description:
 *
 * @Author: fenghao
 * @Create 2023/12/9 22:12
 * @Version 1.0
 */
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    public void testChangeInfo(){
        try {
            studentService.changeInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Transactional
    public void testPropagation(){
        try {
            studentService.changeAge();
            studentService.changeName();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
