package com.vdubyk.hm9.impl;

import com.vdubyk.hm9.Developer;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("C++ developer writes C++ code...");
    }
}
