package com.dingmouren.lambdademo.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * Created by dingmouren on 2017/2/17.
 并行Stream:基于Fork-join并行分解框架实现，将大数据集合切分为多个小数据结合交给不同的线程去处理，这样在多核处理情况下，性能会得到很大的提高。
 这和MapReduce的设计理念一致：大任务化小，小任务再分配到不同的机器执行。只不过这里的小任务是交给不同的处理器。
 结果是性能提高50%，单核下还是串行流性能比较好，并行流的使用场景是多核+大数据

 */

public class I_并行Stream {
    public static void main(String[] args) {
        //创建一个大集合
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            UUID uuid = UUID.randomUUID();
            list.add(uuid.toString());
        }
        parallelStreamSortedTest(list);
        streamSortedTest(list);
    }
    //并行stream
    private static void parallelStreamSortedTest(List<String> list){
        long startTime = System.nanoTime();//返回最准确的可用系统计时器的当前值，以毫微秒为单位。
        long count = list.parallelStream().sorted().count();
        long endTime = System.nanoTime();
        long millis = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
        System.out.printf("并行排序花费时间：%d ms",millis);
    }
    //串行stream
    private static void streamSortedTest(List<String> list){
        long startTime = System.nanoTime();//返回最准确的可用系统计时器的当前值，以毫微秒为单位。
        long count = list.stream().sorted().count();
        long endTime = System.nanoTime();
        long millis = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
        System.out.printf("串行排序花费时间：%d ms",millis);
    }
}
