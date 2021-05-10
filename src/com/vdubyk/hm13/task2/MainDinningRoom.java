package com.vdubyk.hm13.task2;

public class MainDinningRoom {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 5; i++) {
            new Thread(new Philosopher(i)).start();
            Thread.sleep(400);
        }
    }
}
