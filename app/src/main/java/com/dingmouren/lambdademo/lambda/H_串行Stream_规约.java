package com.dingmouren.lambdademo.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by dingmouren on 2017/2/17.
 * 规约(reduce):允许我们用自己的方式计算元素或者将一个stream中元素以某种规律关联
 */

public class H_串行Stream_规约 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a1");list.add("a2");list.add("a3");list.add("b1");list.add("b2");list.add("b3");
        streamReduceTest(list);
    }
    private static void streamReduceTest(List<String> list){
        Optional<String> optional = list.stream().sorted().reduce((s, s2) -> {
            System.out.println(s+"-"+s2);
            return s+"-"+s2;
        });
    }
}
