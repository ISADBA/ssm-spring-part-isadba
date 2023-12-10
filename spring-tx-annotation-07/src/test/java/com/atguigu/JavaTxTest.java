package com.atguigu;

import com.atguigu.config.JavaConfig;
import com.atguigu.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * ClassName: JavaTxTest
 * Package: com.atguigu
 * Description:
 *
 * @Author: fenghao
 * @Create 2023/12/9 22:16
 * @Version 1.0
 */
@SpringJUnitConfig(value = JavaConfig.class)
public class JavaTxTest {
    @Autowired
    private StudentController studentController;
    @Test
    public void testChangeInfo(){
        studentController.testChangeInfo();
    }

    @Test
    public void testPropagation(){
        studentController.testPropagation();
    }

}
