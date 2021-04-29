package com.vdubyk.hm11;

public class Pong implements Runnable {
    private PingPong pingPong;

    public Pong(PingPong pingPong) {
        this.pingPong = pingPong;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            pingPong.pong();
        }
    }
}
