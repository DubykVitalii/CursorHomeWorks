package com.vdubyk.hm1;
import java.util.Arrays;

public class AverageArray {
    public static void main(String[] args) {
        double [] array = {1,5,4.5,5,10.5,25};
        double sumArrays=0;
        for(int i=0; i< array.length; i++)
        {
            sumArrays=sumArrays+array[i];
        }
        System.out.println("Average array - "+sumArrays/array.length);
    }
}
