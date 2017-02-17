package com.dingmouren.lambdademo.lambda;

/**
 * Created by dingmouren on 2017/2/17.
 */

public class D_访问权限之成员_静态 {
    public static void main(String[] args) {

    }
    public int num1 = 6;
    public static int num2 = 8;
    private int getSum(){
        Sum sum = value -> {
            num1 = 10;
            num2 = 10;
            return  num1 + num2;
        };
        return sum.add(1);
    }

    /**
     * 函数式接口
     */
    @FunctionalInterface
    interface Sum{
        int add(int value);
    }
}
