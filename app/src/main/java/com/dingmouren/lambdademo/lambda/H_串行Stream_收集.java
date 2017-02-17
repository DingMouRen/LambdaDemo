package com.dingmouren.lambdademo.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by dingmouren on 2017/2/17.
 * 收集(collect):在对经过变换后，将变换的stream元素收集，比如将这些元素存在集合中，可以使用stream提供的collect方法
 */

public class H_串行Stream_收集 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a1");list.add("a2");list.add("a3");list.add("b1");list.add("b2");list.add("b3");
        streamCollectTest(list);
    }

    private static void streamCollectTest(List<String> list){
        List<String> listNew = list.stream().filter(s -> s.startsWith("b")).sorted().collect(Collectors.toList());
        System.out.println(listNew );
    }
}
