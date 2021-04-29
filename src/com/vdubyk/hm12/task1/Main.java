package com.vdubyk.hm12.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        String string = switch (choice) {
            case 10,9 -> "Well";
            case 7,8 -> "Good";
            case 6 -> "Acceptable";
            case 5 -> "Bad";
            case 0,1,2,3,4 -> "Very Bad";
            default -> "Choice incorrect";
        };
        System.out.println(string.toString());
    }
}
