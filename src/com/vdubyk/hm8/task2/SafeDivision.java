package com.vdubyk.hm8.task2;

import com.vdubyk.hm8.task2.exception.ExceptionDivZero;

import java.util.Scanner;

public class SafeDivision {
    static double divNumberAandB() {
        {
            System.out.println("Please write number A: ");
        }
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b;
        boolean isZero = false;
        do {
            System.out.println("Please write number B: ");
            b = in.nextInt();
            isZero = false;
            if (b == 0) {
                isZero = true;
                try {
                    throw new ExceptionDivZero("Division on zero impossible");
                } catch (ExceptionDivZero exceptionDivZero) {
                    System.err.println("Division on zero impossible. Please new number B: ");
                }
            }
        } while (isZero);

        return (double) a / b;
    }

}

