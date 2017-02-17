package com.dingmouren.lambdademo.lambda;

import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Created by dingmouren on 2017/2/17.
 */

public class J_懒操作 {
    public static void main(String[] args) {
        streamCreateTest();
    }
    public static void streamCreateTest() {
        Stream<Long> stream = Stream.generate(new NatureSeq());
        System.out.println("元素个数："+stream.map((param) -> {
            return param;
        }).limit(1000).count());

    }

    //递增序列
    static  class NatureSeq implements Supplier<Long> {
        long value = 0;

        @Override
        public Long get() {
            value++;
            return value;
        }
    }

}
