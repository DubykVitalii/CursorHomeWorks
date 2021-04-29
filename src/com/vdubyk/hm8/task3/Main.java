package com.vdubyk.hm8.task3;

public class Main {
    public static void main(String[] args) throws Throwable {
        RethrowException rethrowException = new RethrowException();
        try {
            rethrowException.someMethod();
        } catch (Exception exception) {
            System.out.println("Caught in main");
        }
    }
}

