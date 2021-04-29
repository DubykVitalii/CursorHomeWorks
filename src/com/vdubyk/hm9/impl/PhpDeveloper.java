package com.vdubyk.hm9.impl;

import com.vdubyk.hm9.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer writes php code...");
    }
}
