package com.tao;

public class Teacher extends Person {

    private float salary;

    public Teacher() {
        super();
        this.salary = 0;
    }

    public Teacher(String name, int age, float salary) {
        super(name, age);
        this.salary = salary;
    }

    public Teacher(String name, float salary) {
        super(name);
        this.salary = salary;
    }

    //重载(overload)，覆盖(override)
    //
    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public void run() {
        System.out.println("------new new new ----");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                '}';
    }
}
