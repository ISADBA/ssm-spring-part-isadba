package com.atguigu.advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * ClassName: LogAdvice
 * Package: com.atguigu.advice
 * Description: 增强类
 *
 * @Author: fenghao
 * @Create 2023/12/8 23:18
 * @Version 1.0
 */
@Component
@Aspect
@Order(1)
public class LogAdvice {
    @Before("execution(int com.atguigu.service.impl.*.*(..))")
    public void start(){
        System.out.println("LogAdvice切面 方法开始了");
    }

    @AfterReturning("execution(int com.atguigu.service.impl.*.*(..))")
    public void after(){
        System.out.println("LogAdvice切面 方法结束了");
    }

    @AfterThrowing("execution(int com.atguigu.service.impl.*.*(..))")
    public void err(){
        System.out.println("LogAdvice切面 方法报错了");
    }
}
