package com.tao;


public class Person  extends Object {//parent class  child

    private String name;//field =attributes=instance variable
    private int age;//attributes

    private  int height;

    public Person() {
        name = "none";
        age = 0;

    }

    public Person(String name, int age) {//Constructors method
        this.name = name;//don't do this
        this.age = age;

    }

    public Person(String name) {//Constructors
        this.name = name;//don't do this
        this.age = 0;
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run() {// methods=behaviors
        System.out.println("--runing--" + this.name);
    }

    public int getAge() {//Non-static methods,accessor method
        return this.age;
    }

    public void setAge(int age) {//Non-static methods
        this.age = age;
    }

    public static Person createPerson() {
        Person person1 = new Person("taozs1", 19);
        Person person2 = new Person("taozs2", 19);

        return person1;//stack  garbage collection(GC)
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
