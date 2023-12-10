package com.atguigu.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * ClassName: JavaConfig
 * Package: com.atguigu.config
 * Description:
 *
 * @Author: fenghao
 * @Create 2023/12/9 21:56
 * @Version 1.0
 */
@Configuration
@ComponentScan(basePackages = "com.atguigu")
@PropertySource(value = "classpath:jdbc.properties")
@EnableTransactionManagement
public class JavaConfig {
    @Value("${atguigu.driver}")
    private String driver;
    @Value("${atguigu.url}")
    private String url;
    @Value("${atguigu.username}")
    private String username;
    @Value("${atguigu.password}")
    private String password;

    // druid连接池实例化
     @Bean
     public DruidDataSource dataSource()  {
            DruidDataSource dataSource = new DruidDataSource();
            dataSource.setDriverClassName(driver);
            dataSource.setUrl(url);
            dataSource.setUsername(username);
            dataSource.setPassword(password);
            return dataSource;
     }

     @Bean
     public JdbcTemplate jdbcTemplate(DataSource dataSource){
            JdbcTemplate jdbcTemplate = new JdbcTemplate();
            jdbcTemplate.setDataSource(dataSource);
            return jdbcTemplate;
     }

     @Bean
     public TransactionManager transactionManager(DataSource dataSource){
         DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
         // 需要连接池对象
         dataSourceTransactionManager.setDataSource(dataSource);
         return dataSourceTransactionManager;
     }
}
