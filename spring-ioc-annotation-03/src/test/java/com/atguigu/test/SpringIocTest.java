package com.atguigu.test;

import com.atguigu.ioc_01.XxxController;
import com.atguigu.ioc_02.JavaBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: SpringIocTest
 * Package: com.atguigu.test
 * Description:
 *
 * @Author: fenghao
 * @Create 2023/12/5 20:44
 * @Version 1.0
 */
public class SpringIocTest {
    @Test
    public void test01() {
        // 1. 创建IoC容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-01.xml");
        // 2. 获取容器中的组件
        XxxController xxxController = applicationContext.getBean("ergouzi", XxxController.class);

        // 3. 使用组件
        xxxController.SayHello();

        // 4. 关闭IoC容器
        applicationContext.close();

    }

    // 触发 @PostConstruct  和 @PreDestroy 生命周期
    @Test
    public void test02() {
        // 1. 创建IoC容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-02.xml");
        // 2. 获取容器中的组件
        JavaBean javaBean = applicationContext.getBean("javaBean", JavaBean.class);

        // 3. 使用组件
        javaBean.sayHello();

        // 4. 关闭IoC容器
        applicationContext.close();

    }

    // Scope作用域测试
    @Test
    public void test03(){
        // 1. 创建IoC容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-02.xml");
        // 2. 获取容器中的组件
        JavaBean javaBean = applicationContext.getBean("javaBean", JavaBean.class);
        JavaBean javaBean2 = applicationContext.getBean("javaBean", JavaBean.class);


        // 3. 使用组件
        if (javaBean == javaBean2) {
            System.out.println("两个对象相同");
        }else{
            System.out.println("两个对象不相同");
        }
        javaBean.sayHello();
        // 4. 关闭IoC容器
        applicationContext.close();
    }
}
