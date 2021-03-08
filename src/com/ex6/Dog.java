package com.ex6;

public class Dog implements Animal {
    public void run() {
        System.out.println("----run-----");
    }

    @Override
    public int eat(String name) {
        return 0;
    }

    public void run1() {
        System.out.println("----run-----");
    }
}
