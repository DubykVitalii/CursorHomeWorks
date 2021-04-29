package com.vdubyk.hm11;

public class Ping implements Runnable {
    private PingPong pingPong;

    public Ping(PingPong pingPong) {
        this.pingPong = pingPong;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            pingPong.ping();
        }
    }
}
