package com.vdubyk.hm4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;

public class MyList<T extends Comparable<? super T>> {

    private final ArrayList<T> list;

    public MyList() {
        list = new ArrayList<T>();
    }

    public void add(T a) {
        list.add(a);
    }

    public T highest() {
        return list.stream().min(Collections.reverseOrder()).orElseThrow(() -> new NoSuchElementException("List is empty"));
    }

    public T lowest() {
        return list.stream().sorted().findFirst().orElseThrow(() -> new NoSuchElementException("List is empty"));
    }

    public void display() {
        System.out.println(list);
    }

    @Override
    public String toString() {
        return "MyList{" +
                "list=" + list +
                '}';
    }
}
