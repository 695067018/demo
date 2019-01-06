package com.example.demo.lambda;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.Consumer;

public class TestLambda {

    @Test
    //原来的写法
    public void test1(){
        int num = 0;//jkd
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!" + num);
            }
        };
        r.run();
        System.out.println("-------");
    //现在的lambda表达式的写法
        Runnable r1=()->System.out.println("Hello lambda" + num);
        r1.run();
    }
    @Test
    public  void test2(){
        Consumer<String> com = x -> System.out.println(x);
        com.accept("执行");
     }

     @Test
    public void test3(){
         Comparator<Integer> com = (x,y) -> {
             System.out.println("函数式接口");
             return Integer.compare(x,y);
         };
     }
     @Test
    public void test4() {
         Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
     }
     @Test
    public void test5() {
         String[] strs = {"aa","bb","cc"};
         List<String> list = new ArrayList<>();
         show(new HashMap<>());
     }
     @Test
    public void show(Map<String,Integer> map) {
         String[] strs = {"aa","bb","cc"};
         List<String> list = new ArrayList<>();
     }
     //需求：对一个数进行运算
    @Test
    public void test6(){
        Integer num = operation(100,(x)->x * x);
        System.out.println(num);
        System.out.println(operation(200,(y)->y+200));
    }

    public Integer operation(Integer num,MyFun mf){
        return mf.getValute(num);
    }



}
