package com.tao;

public class Student extends Person{
    private int score;

    public Student(int score) {
        this.score = score;
    }

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public Student(String name, int score) {
        super(name);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void exam(){
        System.out.println("------");
    }
}
