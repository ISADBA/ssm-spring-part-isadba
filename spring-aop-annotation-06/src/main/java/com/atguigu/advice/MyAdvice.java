package com.atguigu.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * ClassName: MyAdvice
 * Package: com.atguigu.advice
 * Description: 定义四个增强方法，获取目标方法的信息，返回值，异常对象
 * 1. 定义增强方法
 * 2. 使用注解制定对应的位置
 * 3. 配置切点表达式选中方法
 * 4. 切面和Ioc配置
 * 5. 开启aspectj注解支持
 *
 * @Author: fenghao
 * @Create 2023/12/9 19:20
 * @Version 1.0
 */
@Component
//@Aspect
public class MyAdvice {
    @Before("execution(* com.atguigu.service.impl.*.*(..))")
    public void before(JoinPoint joinPoint){
        System.out.println("[MyAdvice AOP异常通知]  方法要开始了");
        // 获取目标方法的参数
        Object[] args = joinPoint.getArgs();
        System.out.println("[MyAdvice AOP异常通知]  args = " + args);
        // 获取目标方法的名字
        String name = joinPoint.getSignature().getName();
        System.out.println("[MyAdvice AOP异常通知]  name = " + name);
        // 获取目标方法所在的类的全类名
        String className = joinPoint.getTarget().getClass().getName();
        System.out.println("[MyAdvice AOP异常通知]  className = " + className);
    }

    @AfterReturning(value = "execution(* com.atguigu.service.impl.*.*(..))",returning = "result")
    public void after(JoinPoint joinPoint,Object result) {
        System.out.println("[MyAdvice AOP异常通知]  方法要返回了");
        // 获取目标方法的返回值类型
        Class returnType = joinPoint.getSignature().getDeclaringType();
        System.out.println("[MyAdvice AOP异常通知]  returnType = " + returnType);
        // 获取目标方法的返回值
        System.out.println("[MyAdvice AOP异常通知]  result = " + result);
    }
    @AfterThrowing(value = "execution(* com.atguigu.service.impl.*.*(..))",throwing = "throwable")
    public void err(JoinPoint joinPoint,Throwable throwable){
        System.out.println("[MyAdvice AOP异常通知]  方法报错了");
        // 获取目标方法的异常对象
        String methodName = joinPoint.getSignature().getName();
        System.out.println("[MyAdvice AOP异常通知] "+methodName+"方法抛异常了，异常类型是：" + throwable.getClass().getName());
    }
}
