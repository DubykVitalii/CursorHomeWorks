package com.vdubyk.hm3.Task1;

import com.vdubyk.hm3.Task1.AbstractClassShape.Shape;
import com.vdubyk.hm3.Task1.Shapes2D.Circle;
import com.vdubyk.hm3.Task1.Shapes2D.Rectangle;
import com.vdubyk.hm3.Task1.Shapes2D.Triangle;
import com.vdubyk.hm3.Task1.Shapes3D.Cuboid;
import com.vdubyk.hm3.Task1.Shapes3D.Sphere;
import com.vdubyk.hm3.Task1.Shapes3D.SquarePyramid;
import com.vdubyk.hm3.Task1.Vertex.Vertex2D;
import com.vdubyk.hm3.Task1.Vertex.Vertex3D;

public class Main {
    public static void main(String[] args) {

        Shape triangle = new Triangle(new Vertex2D(2, 3), new Vertex2D(5, 4), new Vertex2D(8, 6));
        Shape rectangle = new Rectangle(new Vertex2D(5, 5), 10, 15);
        Shape circle = new Circle(new Vertex2D(3, 3), 5);
        Shape squarePyramid = new SquarePyramid(new Vertex3D(4, 4, 4), 4, 4);
        Shape sphere = new Sphere(new Vertex3D(1, 1, 1), 10);
        Shape cuboid = new Cuboid(new Vertex3D(0, 0, 0), 10, 20, 30);

        Shape[] shapes = {triangle, rectangle, circle, squarePyramid, sphere, cuboid};
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].toString());
        }
    }
}
