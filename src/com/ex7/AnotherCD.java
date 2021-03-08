package com.ex7;

public class AnotherCD implements CD{
    private String name;

    public void play(){
        System.out.println("is playing for another cd");
    }

    public void setName(String name){
        this.name =name;

    }
}
