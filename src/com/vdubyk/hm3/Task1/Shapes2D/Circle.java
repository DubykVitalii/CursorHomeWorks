package com.vdubyk.hm3.Task1.Shapes2D;

import com.vdubyk.hm3.Task1.AbstractClassShape.PlaneShape;
import com.vdubyk.hm3.Task1.Vertex.Vertex2D;

public class Circle extends PlaneShape {
    private final Vertex2D a;
    private final double radius;

    public Circle(Vertex2D a, double radius) {
        this.a = a;
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle, " +
                "Vertex Coordinate: A=(" + a.toString() +
                "), Radius=" + radius +
                ", Perimeter=" + getPerimeter() +
                ", Area=" + getArea();
    }
}
