package com.dingmouren.lambdademo.lambda;

import com.dingmouren.lambdademo.lambda.constructor.Boy;
import com.dingmouren.lambdademo.lambda.constructor.Factory;
import com.dingmouren.lambdademo.lambda.constructor.Girl;
import com.dingmouren.lambdademo.lambda.constructor.Parent;

/**
 * Created by dingmouren on 2017/2/17.
 *
 * 相关的类在constructor包中
 */

public class C_方法引用之构造方法引用 {
    public static void main(String[] args){

        //传统方式
        Factory factory1 = new Factory() {
            @Override
            public Parent create(String name, int age) {
                return new Boy(name,age);
            }
        };
        Boy boy = (Boy) factory1.create("小明",18);
        factory1 = new Factory() {
            @Override
            public Parent create(String name, int age) {
                return new Girl(name,age);
            }
        };
        Girl girl = (Girl) factory1.create("小红",18);
        //Lambda方式
        Factory<Boy> boyFactory = Boy::new;
        Boy boy1 = boyFactory.create("小明",18);
        Factory<Girl> girlFactory = Girl::new;
        Girl girl1 = girlFactory.create("小红",18);
    }
}
