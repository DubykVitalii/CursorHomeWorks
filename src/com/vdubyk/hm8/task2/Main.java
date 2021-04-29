package com.vdubyk.hm8.task2;

import com.vdubyk.hm8.task2.exception.ExceptionDivZero;


public class Main {
    public static void main(String[] args) throws ExceptionDivZero {
        System.out.println("Result = "+ SafeDivision.divNumberAandB());
    }
}
