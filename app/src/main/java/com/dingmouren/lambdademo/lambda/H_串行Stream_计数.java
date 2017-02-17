package com.dingmouren.lambdademo.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dingmouren on 2017/2/17.
 * 计数(count):用来统计流中元素的总数
 */

public class H_串行Stream_计数 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a1");list.add("a2");list.add("a3");list.add("b1");list.add("b2");list.add("b3");
        streamCountTest(list);
    }

    private static void streamCountTest(List<String> list){
        long count = list.stream().filter(s -> s.startsWith("b")).count();
        System.out.println("以'b'开头的数量："+ count);
    }
}
