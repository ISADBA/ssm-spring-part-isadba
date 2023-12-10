package com.atguigu.test;

import com.atguigu.config.JavaConfig;
import com.atguigu.service.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * ClassName: SpringAopTest
 * Package: com.atguigu.test
 * Description:
 *
 * @Author: fenghao
 * @Create 2023/12/8 21:35
 * @Version 1.0
 */
@SpringJUnitConfig(value = JavaConfig.class)
public class SpringAopTest {
    @Autowired
    private Calculator calculator;
    @Test
    public void test01(){
        int result = calculator.add(1,1);
        System.out.println("result = " + result);
    }

    @Test
    public void test02(){
        int result = calculator.div(5,0);
        System.out.println("result = " + result);
    }
}
