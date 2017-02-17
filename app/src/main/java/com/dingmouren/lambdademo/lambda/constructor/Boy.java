package com.dingmouren.lambdademo.lambda.constructor;

/**
 * Created by dingmouren on 2017/2/17.
 */
//男孩类
public class Boy extends Parent {
    public Boy(String name, int age) {
        super(name, age);
    }

    @Override
    public void doSome() {
        System.out.println("我是个男孩");
    }
}
