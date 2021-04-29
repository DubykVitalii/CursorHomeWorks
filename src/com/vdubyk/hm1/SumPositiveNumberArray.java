package com.vdubyk.hm1;

public class SumPositiveNumberArray {
    public static void main(String[] args) {
        int[] array = {-1, -5, 3, 22, 3, -4, -1, -12, 22};
        int sumArrayPositiveNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sumArrayPositiveNumber = sumArrayPositiveNumber + array[i];
            }
        }
        System.out.println(sumArrayPositiveNumber);
    }
}
