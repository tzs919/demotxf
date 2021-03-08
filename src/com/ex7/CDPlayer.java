package com.ex7;

public class CDPlayer {
    private CD cd;

    public CDPlayer(CD cd) {
        this.cd = cd;
        cd.setName("tao");
    }

    public void play() {
        cd.play();
    }
}
//松耦合 spring design pattern