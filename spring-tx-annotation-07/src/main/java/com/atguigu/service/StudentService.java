package com.atguigu.service;

import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;

/**
 * ClassName: StudentService
 * Package: com.atguigu.service
 * Description:
 *
 * @Author: fenghao
 * @Create 2023/12/9 22:09
 * @Version 1.0
 */
@Service
public interface StudentService {
    public void changeInfo() throws FileNotFoundException;

    public void changeAge() throws FileNotFoundException;

    public void changeName() throws FileNotFoundException;
}
