package com.dingmouren.lambdademo.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dingmouren on 2017/2/17.
 * 匹配(match):用来判断某个predicate是否和流对象相匹配，最终返回boolean类型的结果
 */

public class H_串行Stream_匹配 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a1");list.add("a2");list.add("a3");list.add("b1");list.add("b2");list.add("b3");
        streamMatchTest(list);
    }

    private static void streamMatchTest(List<String> list){
        //流对象中只要有一个元素匹配就返回true
        boolean anyStartWithA = list.stream().anyMatch(s -> s.startsWith("a"));
        System.out.println("集合中是否有以'a'来头："+ anyStartWithA);
        //流对象中每一个元素都匹配才返回true
        boolean allStartWithA = list.stream().allMatch(s -> s.startsWith("a"));
        System.out.println("集合中每一个都是以'a'开头："+ allStartWithA);
        //流对象中没有匹配时返回true
        boolean noneStartWithA = list.stream().noneMatch(s -> s.startsWith("c"));
        System.out.println("集合中没有以'c'开头："+ noneStartWithA);
    }

}
