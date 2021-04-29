package com.vdubyk.hm3.Task1.Vertex;

public class Vertex3D extends Vertex2D {
    private double z;


    public Vertex3D(double x, double y, double z) {
        super(x,y);
        this.z = z;
    }

    public double getX() {
        return super.getX();
    }

    public void setX(double x) {
        super.setX(x);
    }

    public double getY() {
        return super.getY();
    }

    public void setY(double y) {
        super.setY(y);
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return getX() + ", " + getY() + ", " + z;
    }
}
