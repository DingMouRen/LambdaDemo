package com.dingmouren.lambdademo.lambda.constructor;

/**
 * Created by dingmouren on 2017/2/17.
 */
//女孩类
public class Girl extends Parent {
    public Girl(String name, int age) {
        super(name, age);
    }

    @Override
    public void doSome() {
        System.out.println("我是个女孩");
    }
}
