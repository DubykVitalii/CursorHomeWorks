package com.vdubyk.hm11;

public class Main {
    public static void main(String[] args) {
        PingPong pingPong = new PingPong();
        Pong pong = new Pong(pingPong);
        Ping ping = new Ping(pingPong);

        Thread pingThread = new Thread(ping);
        Thread pongThread = new Thread(pong);

        pingThread.start();
        pongThread.start();

    }
}
