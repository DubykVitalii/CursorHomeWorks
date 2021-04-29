package com.vdubyk.hm3.Task1.Vertex;

public class Vertex2D {
    private double x;
    private double y;


    public Vertex2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceVertex(Vertex2D a) {
        return Math.sqrt(Math.pow((this.getX() - a.getX()), 2) + Math.pow((this.getY() - a.getY()), 2));
    }

    @Override
    public String toString() {
        return x + ", " + y;
    }
}
