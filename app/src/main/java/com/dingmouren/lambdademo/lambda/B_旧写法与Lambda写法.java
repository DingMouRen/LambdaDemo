package com.dingmouren.lambdademo.lambda;

/**
 * Created by dingmouren on 2017/2/17.
 */

public class B_旧写法与Lambda写法 {

    //传统方式使用接口
    Transform<String ,Integer> transform1 = new Transform<String, Integer>() {
        @Override
        public Integer transform(String s) {
            return Integer.valueOf(s);
        }
    } ;

    //Lambda方式使用接口,就是这么简单粗暴，没脾气
    Transform<String,Integer> transform2 = (s)-> Integer.valueOf(s);

//------------------------------------------------------------------------------------------------

    //传统方式实现Runnable
    Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("我是传统方式的Runnable");
        }
    });

    //Lambda方式实现Runnable
    Thread thread2 = new Thread(()-> System.out.println("我是Lambda方式的Runnable"));

}


/**
 * 函数式接口
 * @param <A>
 * @param <B>
 */
@FunctionalInterface
interface Transform<A,B>{
    B transform(A a);
}
