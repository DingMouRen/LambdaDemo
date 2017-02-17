package com.dingmouren.lambdademo.lambda;

/**
Lambda语法
(parameters)->expression 或者 (parameters)->{statements;}
 Lambda表达式由三部分组成：
 1.parameters:类似方法中的形参列表，这里的参数是函数式接口里的参数。这里的参数类型可以明确的声明也可不声明而由JVM隐含的推断，当只有一个推断类型时可以省略掉圆括号。
 2.-> :可以理解为“被用于”的意思
 3.方法体：可以是表达式也可以是代码块，实现函数式接口中的方法。这个方法体可以有返回值也可以没有返回值

 示例：
 1.不接受参数，直接返回1
    ()->1
 2.接受两个int类型的参数，返回这两个参数的和
    (int x,int y )-> x+y
 3.接受x,y两个参数，JVM根据上下文推断参数的类型，返回两个参数的和
    (x,y)->x+y
 4.接受一个字符串，打印该字符串，没有返回值
    (String name)->System.out.println(name)
 5.接受一个参数，JVM根据上下文推断参数的类型，打印该参数，没有返回值,只有一个参数可以省略圆括号
   name->System.out.prinln(name)
 6.接受两个String类型参数，分别输出，没有返回值
    (String name,String sex)->{System.out.println(name);System.out.println(sex)}
 7.接受呀一个参数，返回它本身的2倍
    x->2*x
 */

public class A_语法 {
}
