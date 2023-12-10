package com.atguigu.ioc_03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * ClassName: UserController
 * Package: com.atguigu.ioc_03
 * Description:
 *
 * @Author: fenghao
 * @Create 2023/12/5 21:35
 * @Version 1.0
 */
@Controller
public class UserController {

    // 自动DI依赖注入,对标xml配置的 <property name="userService" ref="userService" />
    // 1. 会自动在IoC找对应的类型的组件
    // 2. 在IoC容器中找到UserService类型的组件,并将其注入到UserController中
    @Autowired
    private  UserService userService;


    public void show(){
        // 调用业务层show
    }
}
