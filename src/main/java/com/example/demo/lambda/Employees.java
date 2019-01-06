package com.example.demo.lambda;

public class Employees {

    private int num;
    private String name;
    private String age;
    private double nu;

    @Override
    public String toString() {
        return "Employees{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", nu=" + nu +
                '}';
    }

    public Employees(int num, String name, String age, double nu) {
        this.num = num;
        this.name = name;
        this.age = age;
        this.nu = nu;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public double getNu() {
        return nu;
    }

    public void setNu(double nu) {
        this.nu = nu;
    }
}
