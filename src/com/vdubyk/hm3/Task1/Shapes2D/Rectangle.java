package com.vdubyk.hm3.Task1.Shapes2D;

import com.vdubyk.hm3.Task1.AbstractClassShape.PlaneShape;
import com.vdubyk.hm3.Task1.Vertex.Vertex2D;

public class Rectangle extends PlaneShape {
    private final Vertex2D a;
    private final double width;
    private final double height;

    public Rectangle(Vertex2D a, double width, double height) {
        this.a = a;
        this.width = width;
        this.height = height;
    }


    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {

        return width * 2 + height * 2;
    }

    @Override
    public String toString() {
        return "Rectangle, " +
                "Vertex Coordinate: A=(" + a.toString() +
                "), Width=" + width +
                " ,Height=" + height +
                ", Perimeter=" + getPerimeter() +
                ", Area=" + getArea();
    }
}
