package com.atguigu.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * ClassName: JavaConfig
 * Package: com.atguigu.config
 * Description:
 *
 * @Author: fenghao
 * @Create 2023/12/8 21:33
 * @Version 1.0
 */
@Configurable
@ComponentScan(basePackages = "com.atguigu")
@EnableAspectJAutoProxy
public class JavaConfig {
}
