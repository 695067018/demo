package com.example.demo.lambda;

import org.junit.jupiter.api.Test;
import sun.applet.Main;
import sun.corba.EncapsInputStreamFactory;

import java.io.FileInputStream;
import java.util.*;

public class TestStramAPI3 {
    private static final int a = 10;
    
    /**
     * a
     */
    private int b = 2;



    public static void main(String[] args) {

    }
    List<Employee1> emp = Arrays.asList(
            new Employee1("张三",18,999.99,Employee1.Status.FREE),
            new Employee1("李四",58,555.55,Employee1.Status.BUSY),
            new Employee1("王五",26,333.33,Employee1.Status.VOVATION),
            new Employee1("赵六",36,666.66,Employee1.Status.FREE),
            new Employee1("田七",36,888.88,Employee1.Status.BUSY)
    );

    @Test
    public void test1(){
        boolean b1 = emp.stream()
                .allMatch((e)-> e.getStatus().equals(Employee1.Status.BUSY));
        System.out.println(b1);

        boolean b2 = emp.stream()
                .anyMatch((e)-> e.getStatus().equals(Employee1.Status.BUSY));
        System.out.println(b2);

        boolean b3 = emp.stream()
                .noneMatch((e)-> e.getStatus().equals(Employee1.Status.BUSY));
        System.out.println(b3);

        Optional<Employee1> op = emp.stream()
                .sorted((e1,e2)-> -Double.compare(e1.getSalary(),e2.getSalary()))
                .findFirst();
        System.out.println(op.get());

        Optional<Employee1> op2= emp.parallelStream()
                .filter((e) ->e.getStatus().equals(Employee1.Status.FREE))
                .findAny();
        System.out.println(op2.get());

    }

    @Test
    public void test2(){
        String[] arr = new String[]{"1","2","3"};
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            
        }
        ArrayList list = new ArrayList();
        for (Object o : list) {

        }
        for (int i = 0; i < list.size(); i++) {
            
        }
        for (int i = list.size() - 1; i >= 0; i--) {

        }
        if (list == null) {
            
        }
        if (list != null) {
            
        }
        if (list != null) {

        }
        if (list == null) {

        }

                
        Long count = emp.stream()
                .count();
        System.out.println(count);
        list.add(1);
//        emp.stream()
//                .max((e1,e2) ->Double.compare(e1.getSalary(),))
    }
}
