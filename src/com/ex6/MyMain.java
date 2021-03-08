package com.ex6;

public class MyMain {

    public static void f1(Animal animal) {
        animal.run();
    }

    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog(), new Cat()};

        for (Animal animal : animals) {
            f1(animal);
        }

    }
}
