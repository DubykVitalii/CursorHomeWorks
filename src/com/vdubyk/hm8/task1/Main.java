package com.vdubyk.hm8.task1;

import com.vdubyk.hm8.task1.exception.ExceptionA;
import com.vdubyk.hm8.task1.exception.ExceptionB;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String string = null;
        try {
            System.out.println(string.length());
        } catch (NullPointerException e) {
            System.err.println("ERROR: strings value = null");
        }

        try {
            FileReader f = new FileReader("test.txt");
        } catch (IOException e) {
            System.err.println("ERROR: File not found");
        }

        try {
            throw new ExceptionA("ERROR: Exception A");
        } catch (ExceptionA e) {
            System.err.println(e.getMessage());
        }

        try {
            throw new ExceptionB("ERROR: Exception B ");
        } catch (ExceptionB e) {
            System.err.println(e.getMessage());
        }
    }

}
