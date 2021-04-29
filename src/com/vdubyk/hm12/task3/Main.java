package com.vdubyk.hm12.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Choose exercise [uniqueNumbers, marks] or type 'q' for exit:");
            Scanner scanner = new Scanner(System.in);
            String choiceStr = scanner.next();

            if (choiceStr.equals("uniqueNumbers")) {
                Main.UniqueNumbers();
            } else if (choiceStr.equals("marks")) {
                Main.Marks();
            } else if (choiceStr.equals("q")) {
                System.exit(0);
            } else {
                System.err.println("Incorrect choice ");
            }
        }
    }

    public static void Marks() {

        System.out.println("Enter your mark:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        String string = switch (choice) {
            case 10, 9 -> "Well";
            case 7, 8 -> "Good";
            case 6 -> "Acceptable";
            case 5 -> "Bad";
            case 0, 1, 2, 3, 4 -> "Very Bad";
            default -> "Choice incorrect";
        };
        System.out.println(string.toString());
    }

    public static void UniqueNumbers() {
        System.out.println("Enter numbers set:");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        String strArray[] = string.split(",");
        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < strArray.length; i++) {
            integers.add(Integer.parseInt(strArray[i]));
        }

        double result = integers.stream().collect(Collectors.teeing(
                Collectors.counting(),
                Collectors.toSet(),
                (count, setCount) -> (double) setCount.size() / (double) count));

        System.out.println(result * 100 + "% percent of unique numbers");
    }
}

