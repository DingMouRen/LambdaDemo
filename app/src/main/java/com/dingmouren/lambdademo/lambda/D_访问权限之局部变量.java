package com.dingmouren.lambdademo.lambda;

/**
 * Created by dingmouren on 2017/2/17.
  在Lambda表达式使用中，Lambda表达式外面的局部变量会被JVM隐式的编译成final类型，Lambda表达式内部只能访问，不能修改
  Lambda表达式内部对静态变量和成员变量是可读可写的
  Lambda不能访问函数接口的默认方法，在函数接口中可以添加default关键字定义默认的方法
 */

public class D_访问权限之局部变量 {

    public static void main(String[] args) {
        int num = 6;//局部变量
        Sum sum = value -> {
//            num = 8; 这里会编译出错
            return num + value;
        };
        sum.add(8);
    }

    /**
     * 函数式接口
     */
    @FunctionalInterface
    interface Sum{
        int add(int value);
    }
}
