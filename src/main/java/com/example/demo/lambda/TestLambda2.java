package com.example.demo.lambda;

import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.*;

public class TestLambda2 {

    @Test
    public void test7(){
        Function<Integer,String[]> fun = (x)-> new String[x];
        String[] strs = fun.apply(10);
        System.out.println(strs.length);
        Function<Integer,String[]> fun2 = String[]::new;
        String[] strs2 = fun2.apply(20);
        System.out.println(strs2.length);
    }

    @Test
    public void test5(){
        Supplier<Employee> sup = () -> new Employee();
        Supplier<Employee> sup2 = Employee::new;
        Employee emp = sup2.get();
        System.out.println(emp);
    }

    @Test
    public void test6(){
        Function<Integer,Employee> fun = (x) -> new Employee(x);
        Function<Integer,Employee> fun2 = Employee::new;
        Employee emp = fun2.apply(101);
        System.out.println(emp);
        BiFunction<Integer,Integer,Employee> biFunction = Employee::new;
        System.out.println(biFunction.apply(1,2));
    }

    @Test
    public void test4(){
        BiPredicate<String,String> bp = (x,y) ->x.equals(y);
        BiPredicate<String,String> bp2 = String::equals;
    }
    @Test
    public void test3(){
        Comparator<Integer> com = (x,y) ->Integer.compare(x,y);
        Comparator<Integer> com1 = Integer::compare;
    }

    @Test
    public void test1(){
        PrintStream ps1 = System.out;
        Consumer<String> con = (x) ->ps1.println(x);
        con.accept("sfdsf");
        PrintStream ps = System.out;
        Consumer<String> con1 = ps::println;
        Consumer<String> con2 = System.out::println;
        con2.accept("abcdef");
    }
    @Test
    public void test2(){
        Employee emp = new Employee();
        Supplier<String> sup = () ->emp.getName();
        String str = sup.get();
        System.out.println(str);

        Supplier<Integer> sup2 = emp::getAge;
        Integer num = sup2.get();
        System.out.println(num);
    }
}
