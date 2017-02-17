package com.dingmouren.lambdademo.lambda;

import java.util.function.Consumer;

/**
 * consumer接口：对输入的参数进行操作。有输入没输出
 */
public class F_实践之Consumer {
    public static void main(String[] args) {
        consumerTest();
    }
    private static void consumerTest(){
        Consumer<Integer> add5 = (p) -> {
            System.out.println("old value:" + p);
            p = p + 5;
            System.out.println("new value:" + p);
        };
        add5.accept(10);
    }
}
