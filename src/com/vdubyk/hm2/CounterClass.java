package com.vdubyk.hm2;

public class CounterClass {
    private static int count;

    public CounterClass() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
