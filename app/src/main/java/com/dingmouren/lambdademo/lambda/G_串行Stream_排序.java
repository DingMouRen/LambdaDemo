package com.dingmouren.lambdademo.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dingmouren on 2017/2/17.
 * 排序(sorted):结合Comparator,该操作返回一个排序过后的流的视图，原始流的顺序不会改变。通过Comparator来指定排序规则，默认是自然排序
 */

public class G_串行Stream_排序 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a1");list.add("a2");list.add("a3");list.add("b1");list.add("b2");list.add("b3");
        streamSortedTest(list);
    }

    private static void streamSortedTest(List<String> list){
        //默认排序
        list.stream().filter(s -> s.startsWith("a")).forEach(System.out::println);
        System.out.println("- - - - - - - - -");
        //自定义排序
        list.stream().sorted(((s, t1) -> t1.compareTo(s))).filter(s -> s.startsWith("a")).forEach(System.out::println);
    }
}
