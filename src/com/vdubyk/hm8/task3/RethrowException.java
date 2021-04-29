package com.vdubyk.hm8.task3;

public class RethrowException {

    public static void someMethod() throws Throwable {
        try {
            someMethod2();
        } catch (Exception exception) {
            System.out.println("The Exception in someMethod() method");
            throw exception;
        }
    }

    public static void someMethod2() throws Exception {
        System.out.println("The Exception in someMethod2() method");
        throw new Exception("thrown from someMethod2() method");
    }

}

