package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Comparator;
import java.util.TreeSet;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    //原来匿名内部类
    @Test
    public void contextLoads() {
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1,Integer o2) {
                return Integer.compare(o1,o2);
            }
        };

        TreeSet<Integer> tr = new TreeSet<>(com);
    }
    //lambda 表达式
    @Test
    public void test1(){
        Comparator<Integer> com = (x,y)->Integer.compare(x,y);
        TreeSet<Integer> tr = new TreeSet<>(com);
    }
}
