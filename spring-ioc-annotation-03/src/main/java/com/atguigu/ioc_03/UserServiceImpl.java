package com.atguigu.ioc_03;

import org.springframework.stereotype.Service;

/**
 * ClassName: UserServiceImpl
 * Package: com.atguigu.ioc_03
 * Description:
 *
 * @Author: fenghao
 * @Create 2023/12/5 21:36
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void show() {
        System.out.println("UserServiceImpl.show");
    }
}
