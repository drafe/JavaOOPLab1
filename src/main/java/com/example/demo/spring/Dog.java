package com.example.demo.spring;

public class Dog implements Pet{
    @Override
    public void say() {
        System.out.println("Woof-woof");
    }
}
