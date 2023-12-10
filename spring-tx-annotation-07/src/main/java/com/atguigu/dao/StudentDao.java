package com.atguigu.dao;

import org.springframework.stereotype.Repository;

/**
 * ClassName: StudentDao
 * Package: com.atguigu.dao
 * Description:
 *
 * @Author: fenghao
 * @Create 2023/12/9 22:04
 * @Version 1.0
 */
@Repository
public interface StudentDao {
    public void updateNameById(String name,Integer id);
    public void updateAgeById(Integer age,Integer id);
}
