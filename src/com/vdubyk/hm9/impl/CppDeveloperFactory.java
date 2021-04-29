package com.vdubyk.hm9.impl;

import com.vdubyk.hm9.Developer;
import com.vdubyk.hm9.DeveloperFactory;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
