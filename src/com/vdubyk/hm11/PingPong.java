package com.vdubyk.hm11;

public class PingPong {
    private boolean flag;

    public synchronized void ping() {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        flag = false;
        System.out.println("ping");
        notifyAll();
    }

    public synchronized void pong() {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        flag = true;
        System.out.println("pong");
        notifyAll();
    }
}
