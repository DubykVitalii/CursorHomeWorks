package com.vdubyk.hm2;


public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double areaCircle() {
        return Math.PI * radius * radius;
    }
}
