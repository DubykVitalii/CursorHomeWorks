package com.vdubyk.hm9.impl;

import com.vdubyk.hm9.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code...");
    }
}
