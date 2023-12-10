package com.atguigu.ioc_02;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * ClassName: JavaBean
 * Package: com.atguigu.ioc_02
 * Description:
 *
 * @Author: fenghao
 * @Create 2023/12/5 21:07
 * @Version 1.0
 */
//@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE) // 多例
    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON) // 单例
@Component
public class JavaBean {
    @PostConstruct
    public void Init(){
        System.out.println("init");
    }

    public void sayHello(){
        System.out.println("hello");
    }
    @PreDestroy
    public void Destory(){
        System.out.println("destory");
    }
}
