package com.vdubyk.hm6.task2;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        URL fileURL = new URL("https://drive.google.com/uc?export=download&confirm=no_antivirus&id=1xNjdaKxMvay5dzQ8rLxSmbh_SZqmuEy1");
        Scanner readFile = new Scanner(fileURL.openStream());
        LongAndShortWord longAndShortWord = new LongAndShortWord(readFile);
        longAndShortWord.reader();

        String shortWord = longAndShortWord.shortWords();
        String longWord = longAndShortWord.longWords();
        System.out.println("Short word: " + shortWord + ", number of word in the text: " + longAndShortWord.getValueHashMap(shortWord));
        System.out.println("Long word: " + longWord + ", number of word in the text: " + longAndShortWord.getValueHashMap(longWord));

    }
}
