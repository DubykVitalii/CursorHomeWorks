package com.vdubyk.hm6.task1;

public class Main {
    public static void main(String[] args) {
        String strings = "Hello my name i$$$s Ja@@@va. Collection?2422 comparator, For is/ && !! world 232324";
        StringAnalyzer stringAnalyzer = new StringAnalyzer(strings);
        stringAnalyzer.analyzer();
        stringAnalyzer.display();
    }
}
