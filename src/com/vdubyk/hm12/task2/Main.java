package com.vdubyk.hm12.task2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        double result = Stream.of(1,2,3,4,4,5,5,5,5).collect(Collectors.teeing(
                Collectors.counting(),
                Collectors.toSet(),
                (count, setCount) -> (double) setCount.size() / (double)count));

        System.out.println(result*100+"% percent of unique numbers");
    }
}
