package com.example.demo.lambda;

@FunctionalInterface
public interface MyPredicate<T> {

    public boolean test(T t);
}
