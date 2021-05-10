package com.vdubyk.hm13.task1;

public class EggThread extends Thread {


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Egg");
        }
    }
}
