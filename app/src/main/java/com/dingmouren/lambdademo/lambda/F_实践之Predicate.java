package com.dingmouren.lambdademo.lambda;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * Predicate接口：输入一个参数，返回一个boolean值，内置了许多用于逻辑判断的默认方法
 */
public class F_实践之Predicate {
    public void predicateTest(){
        Predicate<String> predicateStr = s -> s.length()>8;
        boolean testResult = predicateStr.test("test");//需要api 24
        testResult = predicateStr.negate().test("test");//取反，也就是s.length<=8

        Predicate<Object> predicateObj = Objects::nonNull;
        Object obj = null;
        testResult = predicateObj.test(obj);//判断是否为空
    }
}
