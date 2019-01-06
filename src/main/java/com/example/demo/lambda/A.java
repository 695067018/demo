package com.example.demo.lambda;


public class A {
    public static void main(String[] args){
        method((a,b) -> a+b);
    }
    public static void method(B c){
        int result = c.sum(10,20);
        System.out.println("结果是" + result);
    }
}
