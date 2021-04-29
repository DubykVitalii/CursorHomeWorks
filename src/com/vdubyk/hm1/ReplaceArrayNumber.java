package com.vdubyk.hm1;

import java.util.Arrays;

public class ReplaceArrayNumber {
    public static void main(String[] args) {
        int[] array = {3, 2, 3, 1, 4, 2, 8, 3};
        for (int i = 0; i < array.length; i++) {
            if ((array[i] != 0)) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        array[j] = 0;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
