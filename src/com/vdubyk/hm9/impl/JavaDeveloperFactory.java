package com.vdubyk.hm9.impl;

import com.vdubyk.hm9.Developer;
import com.vdubyk.hm9.DeveloperFactory;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
