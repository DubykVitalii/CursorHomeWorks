package com.vdubyk.hm3.Task1.Shapes3D;

import com.vdubyk.hm3.Task1.AbstractClassShape.SpaceShape;
import com.vdubyk.hm3.Task1.Vertex.Vertex3D;

public class SquarePyramid extends SpaceShape {
    private final Vertex3D a;
    private final double baseWidth;
    private final double pyramidHeight;

    public SquarePyramid(Vertex3D a, double baseWidth, double pyramidHeight) {
        this.a = a;
        this.baseWidth = baseWidth;
        this.pyramidHeight = pyramidHeight;
    }

    @Override
    public double getArea() {
        return baseWidth * Math.sqrt(4 * pyramidHeight * pyramidHeight + baseWidth * baseWidth) + baseWidth * baseWidth;
    }

    @Override
    public double getVolume() {
        return baseWidth * baseWidth * pyramidHeight / 3;
    }

    @Override
    public String toString() {
        return "SquarePyramid, " +
                "Vertex Coordinate: A=(" + a.toString() +
                "), Base Width=" + baseWidth +
                ", Pyramid Height" + pyramidHeight +
                ", Volume=" + getVolume() +
                ", Area=" + getArea();
    }
}
