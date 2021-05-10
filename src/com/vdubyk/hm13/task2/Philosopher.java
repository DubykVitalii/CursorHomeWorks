package com.vdubyk.hm13.task2;

import java.util.concurrent.Semaphore;

public class Philosopher implements Runnable {
    private static final boolean[] PLACES = new boolean[2];
    private static final Semaphore SEMAPHORE = new Semaphore(2);
    private final int philosopherNumber;

    public Philosopher(int philosopherNumber) {
        this.philosopherNumber = philosopherNumber;
    }

    @Override
    public void run() {
        System.out.printf("Philosopher №%d approached the table.\n", philosopherNumber);
        try {
            SEMAPHORE.acquire();
            int placeNumber = -1;
            synchronized (PLACES) {
                for (int i = 0; i < 2; i++)
                    if (!PLACES[i]) {
                        PLACES[i] = true;
                        placeNumber = i;
                        System.out.printf("Philosopher №%d sat down at the table %d.\n", philosopherNumber, i);
                        break;
                    }
            }
            Thread.sleep(5000);
            synchronized (PLACES) {
                PLACES[placeNumber] = false;
            }
            SEMAPHORE.release();
            System.out.printf("Philosopher №%d left the table.\n", philosopherNumber);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

