package com.atguigu.service.impl;

import com.atguigu.dao.StudentDao;
import com.atguigu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * ClassName: StudentServiceImpl
 * Package: com.atguigu.service.impl
 * Description:
 *
 * @Author: fenghao
 * @Create 2023/12/9 22:10
 * @Version 1.0
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;


    @Override
    @Transactional(readOnly = false,timeout = 3,
            rollbackFor = Exception.class,
            noRollbackFor = FileNotFoundException.class,
            isolation = Isolation.REPEATABLE_READ)
    public void changeInfo() throws FileNotFoundException {
        studentDao.updateAgeById(88,1);
        System.out.println("修改年龄成功！");
//        int i = 1/0;
        new FileInputStream("xxxx");
        studentDao.updateNameById("test8",1);
        System.out.println("修改姓名成功！");
    }

    //    @Transactional(propagation = Propagation.REQUIRED) // 默认，加入父事务
    @Transactional(propagation = Propagation.REQUIRES_NEW) // 不加入父事务，自己创建事务
    @Override
    public void changeAge() throws FileNotFoundException {
        studentDao.updateAgeById(99,1);
    }

//    @Transactional(propagation = Propagation.REQUIRED) // 默认，加入父事务
    @Transactional(propagation = Propagation.REQUIRES_NEW) // 不加入父事务，自己创建事务
    @Override
    public void changeName() throws FileNotFoundException {
        int i = 1/0;
        studentDao.updateNameById("test99",1);
    }
}
