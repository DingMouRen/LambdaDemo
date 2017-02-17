package com.dingmouren.lambdademo.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by dingmouren on 2017/2/17.
 Lambda为java8带来了闭包，支持对集合对象的stream进行函数式操作， stream api被集成进了collection api  ，允许对集合对象进行批量操作。

 Stream表示数据流，它没有数据结构，本身也不存储元素，其操作也不会改变源Stream，而是生成新Stream.作为一种操作数据的接口，它提供了过滤、排序、映射、规约等多种操作方法，
 这些方法按照返回类型被分为两类：凡是返回Stream类型的方法，称之为中间方法（中间操作），其余的都是完结方法（完结操作）。完结方法返回一个某种类型的值，而中间方法则返回新的Stream。
 中间方法的调用通常是链式的，该过程会形成一个管道，当完结方法被调用时会导致立即从管道中消费值，这里我们要记住：Stream的操作尽可能以“延迟”的方式运行，也就是我们常说的“懒操作”，
 这样有助于减少资源占用，提高性能。对于所有的中间操作（除sorted外）都是运行在延迟模式下。

 Stream不但提供了强大的数据操作能力，更重要的是Stream既支持串行也支持并行，并行使得Stream在多核处理器上有着更好的性能。

 Stream的使用过程有着固定的模式：

 1.创建Stream
 2.通过中间操作，对原始Stream进行“变化”并生成新的Stream
 3.使用完结操作，生成最终结果
 */

//过滤(filter)：结合Predicate接口，Filter对流对象中的所有元素进行过滤,该操作是一个中间操作，这意味着你可以在操作返回结果的基础上进行其他操作
public class G_串行Stream_过滤器 {
    public static void main(String[] args) {
        //创建一个集合
        List<String> list = new ArrayList<>();
        list.add("a1");list.add("a2");list.add("a3");list.add("b1");list.add("b2");list.add("b3");
        sreamFilterTest(list);
    }
    public static void sreamFilterTest(List<String> lists){ //要明确这list的泛型类型，否则jvm不能根据上下文确定参数类型
        lists.stream().filter((s -> s.startsWith("a"))).forEach(System.out::println);//将开头是a的过滤出来

        //等价于以上操作
        Predicate<String> predicate = (s) -> s.startsWith("a");//将开头是a的过滤出来
        lists.stream().filter(predicate).forEach(System.out::println);

        //连续过滤
        Predicate<String> predicate1 = (s -> s.endsWith("1"));//将开头是a，并且结尾是1的过滤出来
        lists.stream().filter(predicate).filter(predicate1).forEach(System.out::println);
    }
}
