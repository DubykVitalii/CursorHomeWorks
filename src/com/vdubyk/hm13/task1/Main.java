package com.vdubyk.hm13.task1;

public class Main {

    public static void main(String[] args) {
        EggThread eggThread = new EggThread();
        eggThread.start();

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Chicken");
        }

        if (eggThread.isAlive()) {
            try {
                eggThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("First was Egg");
        } else {
            System.out.println("First was Chicken");
        }
    }
}
