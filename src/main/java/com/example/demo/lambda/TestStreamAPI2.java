package com.example.demo.lambda;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestStreamAPI2 {

    List<Employee> emp = Arrays.asList(
            new Employee(101,"一",49,99.22),
            new Employee(102,"三",29,66.22),
            new Employee(103,"二",39,66.22),
            new Employee(104,"四",21,11.22),
            new Employee(104,"四",21,11.22),
            new Employee(104,"四",21,11.22)
    );

    @Test
    public void test1(){
        //中间操作，不会执行任何操作
        Stream<Employee> stream = emp.stream()
                                .filter((e)->{
                                    System.out.println("Stream API 的中间操作");
                                    return e.getAge() >35;
                                });
        //终止操作，一次性执行全部内容
        stream.forEach(System.out::println);
    }
    @Test
    public void test2(){
        Iterator<Employee> it = emp.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    @Test
    public void test3(){
        emp.stream()
                .filter((e)->{
                    System.out.println("短路");
                    return e.getAge()>20;
                })
                .limit(2)
                .forEach(System.out::println);
    }
    @Test
    public void test4(){
        emp.stream()
                .filter((e)->e.getAge()>20)
                .skip(1)
                .distinct()
                .forEach(System.out::println);
    }
    @Test
    public void test5(){
        List<String> list = Arrays.asList("aaa","bbb","ccc","ddd","eee");
        list.stream()
                .map((str)->str.toUpperCase())
                .forEach(System.out::println);
        System.out.println("---------------------");
        emp.stream()
                .map(employee -> employee.getName())
                .forEach(System.out::println);
        System.out.println("---------------------");
        Stream<Stream<Character>> stream = list.stream()
                .map(TestStreamAPI2::filterCharacter);
        stream.forEach((sm)->{
            sm.forEach(System.out::println);
        });
        System.out.println("---------------------");
        Stream<Character> sm= list.stream()
                .flatMap(TestStreamAPI2::filterCharacter);
            sm.forEach(System.out::println);
    }

    public static Stream<Character> filterCharacter(String str){
        List<Character> list = new ArrayList<>();
        for(Character ch : str.toCharArray()){
            list.add(ch);
        }
        return list.stream();
    }

    List<Employees> employees = Arrays.asList(
            new Employees(101,"一","49",99.22),
            new Employees(102,"三","29",66.22),
            new Employees(103,"二","39",66.22),
            new Employees(104,"四","21",11.22),
            new Employees(104,"四","21",11.22),
            new Employees(104,"四","21",11.22)
    );
    @Test
    public void test7(){
        List<String> list = Arrays.asList("ccc","aaa","bbb","ddd","eee");

        list.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("---------------------");
        employees.stream()
                .sorted((e1,e2)->{
                    if(e1.getAge().equals(e2.getAge())){
                        return e1.getName().compareTo(e2.getName());
                    }else{
                        return e1.getAge().compareTo(e2.getAge());
                    }
                }).forEach(System.out::println);
    }


}
