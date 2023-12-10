package com.atguigu.service.impl;

import com.atguigu.service.Calculator;
import org.springframework.stereotype.Service;

/**
 * ClassName: CalculatorImpl
 * Package: com.atguigu.service.com.atguigu.service.impl
 * Description:
 *
 * @Author: fenghao
 * @Create 2023/12/8 21:18
 * @Version 1.0
 */
@Service
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int i, int j) {
        int result = i + j;
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = i - j;
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result = i * j;
        return result;
    }

    @Override
    public int div(int i, int j) {
        int result = i / j;
        return result;
    }
}
