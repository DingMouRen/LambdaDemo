package com.dingmouren.lambdademo.lambda.constructor;

/**
 * Created by dingmouren on 2017/2/17.
 * 工厂接口
 */
//工厂类接口
public interface Factory<T extends Parent> {
    T create(String name,int age);
}
