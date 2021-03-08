package com.ex6;

public class Cat implements Animal {
    public void run() {
        System.out.println("cat is running");
    }

    @Override
    public int eat(String name) {
        return 0;
    }
}
