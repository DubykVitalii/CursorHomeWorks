package com.vdubyk.hm7.task3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = List.of("John", "Smith", "John", "Doe", "Jane", "Doe");
        strings.stream().collect(PersonCollector.toPersonList())
                .forEach(System.out::println);
    }
}
