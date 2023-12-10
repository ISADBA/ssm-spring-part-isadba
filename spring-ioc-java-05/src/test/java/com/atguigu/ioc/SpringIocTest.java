package com.atguigu.ioc;

import com.atguigu.config.JavaConfiguration;
import com.atguigu.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ClassName: SpringIocTest
 * Package: com.atguigu.ioc
 * Description:
 *
 * @Author: fenghao
 * @Create 2023/12/7 20:15
 * @Version 1.0
 */
public class SpringIocTest {
    @Test
    public void test01(){
        // 1. 创建Ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfiguration.class);
        // 2. 获取bean
        StudentController studentController = applicationContext.getBean("studentController", StudentController.class);
        // 3. 调用方法
        studentController.findAll();
        // 4. 关闭容器
        applicationContext.close();

    }
}
