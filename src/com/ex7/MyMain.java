package com.ex7;

public class MyMain {
    public static void main(String[] args) {
        SgtPetters sgtPetters=new SgtPetters();

        AnotherCD anotherCD =new AnotherCD();

        CDPlayer cdPlayer =new CDPlayer(anotherCD);

        cdPlayer.play();
    }
}
