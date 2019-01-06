package com.example.demo.lambda;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestLambda3 {

    @Test
    public void test4(){
        List<String> list = Arrays.asList("Hello","atguigu","lamnda","ww");
        List<String> strList = filterStr(list,(s)->s.length()>3);

        for(String str : strList){
            System.out.println(str);
        }
    }

    public List<String> filterStr(List<String> list, Predicate<String> pre){
        List<String> strList = new ArrayList<>();
        for(String str : list){
            if(pre.test(str)){
                strList.add(str);
            }
        }
        return strList;
    }
    @Test
    public void test3(){
        String newStr = strHandler("\t\t\t\t kkkkCk",(str)->str.trim());
        System.out.println(newStr);

        String subStr = strHandler("kkkkkk",(str)->str.substring(2,5));
        System.out.println(subStr);
    }

    public String strHandler(String str, Function<String,String> fun){
        return fun.apply(str);
    }


    @Test
    public void test2(){
        List<Integer> numList = getNumList(10,() -> (int)(Math.random() * 100));
        for(Integer num:numList){
            System.out.println(num);
        }
    }

    public List<Integer> getNumList(int num,Supplier<Integer> sup){
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<num;i++){
            Integer n = sup.get();
            list.add(n);
        }
        return list;
    }


    @Test
    public void test1(){
        happy(10000,(m)->System.out.println("你们喜欢大保健，每次消费"+m+"元"));
    }

    public void happy(double money, Consumer<Double> com){
        com.accept(money);
    }
}
