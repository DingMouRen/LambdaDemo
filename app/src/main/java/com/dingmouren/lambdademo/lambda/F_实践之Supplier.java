package com.dingmouren.lambdademo.lambda;

import java.util.function.Supplier;

/**
 * Supplier接口：返回一个给定类型的结果。不需要输入参数，无输入有输出
 */

public class F_实践之Supplier {
    public static void main(String[] args) {
        supplierTest();
    }

    private static void supplierTest(){
        Supplier<String> supplier = () -> "我就是输出";
        String s = supplier.get();
        System.out.println(s);
    }
}
