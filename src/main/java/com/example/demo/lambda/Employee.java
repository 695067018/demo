package com.example.demo.lambda;

import java.util.Objects;

public class Employee {
    private int num;
    private String name;
    private int age;
    private double nu;


    public Employee(int num, String name, int age, double nu) {
        this.num = num;
        this.name = name;
        this.age = age;
        this.nu = nu;
    }

    public Employee(int num, int age) {
        this.num = num;
        this.age = age;
    }

    public Employee(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", nu=" + nu +
                '}';
    }

    public Employee() {

    }


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getNu() {
        return nu;
    }

    public void setNu(double nu) {
        this.nu = nu;
    }
}
