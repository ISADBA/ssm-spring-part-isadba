package com.atguigu.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * ClassName: AroundMyAdvice
 * Package: com.atguigu.advice
 * Description: 以环绕通知的方式实现MyAdvice功能
 *
 * @Author: fenghao
 * @Create 2023/12/9 20:29
 * @Version 1.0
 */
@Component
@Aspect
@Order(10)
public class AroundMyAdvice {
    @Around("execution(int com.atguigu.service.impl.*.*(..))")
    public Object my(ProceedingJoinPoint pjp){
        System.out.println("[MyAdvice AOP异常通知]  方法要开始了");
        // 获取目标方法的参数
        Object[] args = pjp.getArgs();
        System.out.println("[MyAdvice AOP异常通知]  args = " + args);
        try {
            // 保证目标方法被执行
            Object result = pjp.proceed(args);
            // 加@Before增强代码
            // 获取目标方法的返回值类型
            Class returnType = pjp.getSignature().getDeclaringType();
            System.out.println("[MyAdvice AOP异常通知]  returnType = " + returnType);
            // 获取目标方法的返回值
            System.out.println("[MyAdvice AOP异常通知]  result = " + result);
            // 加@AfterReturning增强代码
            return result;
        } catch (Throwable e) {
            // 加@AfterThrowing增强代码
            System.out.println("[MyAdvice AOP异常通知]  方法报错了");
            throw new RuntimeException(e);
        }finally {
            // 加@After增强代码
            System.out.println("[MyAdvice AOP异常通知]  方法要返回了");
        }
    }
}
