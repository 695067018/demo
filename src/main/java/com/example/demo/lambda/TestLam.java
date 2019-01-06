package com.example.demo.lambda;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestLam {
    List<Employee> emp = Arrays.asList(
            new Employee(101,"一",49,99.22),
            new Employee(102,"三",29,66.22),
            new Employee(103,"二",39,66.22),
            new Employee(104,"四",19,11.22)
    );


    @Test
    public void test1(){
        Collections.sort(emp,(e1,e2)->{
            if(e1.getAge()==e2.getAge()){
                return e1.getName().compareTo(e2.getName());
            }else{
                return  -Integer.compare(e1.getAge(),e2.getAge());
            }
        });
        for(Employee emps:emp){
            System.out.println(emps);
        }
    }
    @Test
    public  void test2(){
        String trimStr = strHandler("\t\t\t 快",str->str.trim());
        System.out.println(trimStr);

        String upper = strHandler("abcdg",(str)->str.toUpperCase());
        System.out.println(upper);
        String newStr = strHandler("快点快点快点快点",(str)->str.substring(2,5));
        System.out.println(newStr);
    }


    public String strHandler(String str,MyFunction mf){
        return mf.getValue(str);
    }

    @Test
    public void test3(){
        op(100L,200L,(x,y)->x+y);
        op(100L,200L,(x,y)->x*y);
    }

    public void op(Long l1,Long l2,MyFunction2<Long,Long> mf){
        System.out.println(mf.getValue(l1,l2));
    }
}
