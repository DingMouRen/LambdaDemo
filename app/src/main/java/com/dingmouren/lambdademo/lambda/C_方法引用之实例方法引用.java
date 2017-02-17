package com.dingmouren.lambdademo.lambda;

/**
 * Created by dingmouren on 2017/2/17.
 */

public class C_方法引用之实例方法引用 {
    public static void main(String[] args){
        //传统方式
        Transform<String ,Integer> transform1 = new Transform<String, Integer>() {
            @Override
            public Integer transform(String s) {
                return new Obj().strToInt(s);
            }
        };
        int result1 = transform1.transform("100");
        //Lambda方式
        Obj obj = new Obj();
        Transform<String,Integer> transform2 = obj::strToInt;
        int result2 = transform2.transform("200");
    }
    /**
     * 函数式接口
     * @param <A>
     * @param <B>
     */
    interface Transform<A,B>{
        B transform(A a);
    }
    /**
     * 实例对象类
     */
    static class Obj{
        public int strToInt(String str){
            return Integer.valueOf(str);
        }
    }
}
