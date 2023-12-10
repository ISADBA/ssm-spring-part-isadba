package com.atguigu.ioc;

import com.atguigu.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: SpringTest
 * Package: com.atguigu.ioc
 * Description:
 *
 * @Author: fenghao
 * @Create 2023/12/6 22:29
 * @Version 1.0
 */
public class SpringIocTest {
    @Test
    public void test01(){
        // 创建IoC容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        // 获取Controller组件
        StudentController studentController = applicationContext.getBean(StudentController.class);

        // 使用Controller组件
        studentController.findAll();

        // 关闭IoC容器
        applicationContext.close();
    }
}
