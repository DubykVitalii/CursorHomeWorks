package com.vdubyk.hm3.Task1.AbstractClassShape;


import com.vdubyk.hm3.Task1.Vertex.Vertex2D;

public abstract class Shape<T extends Vertex2D> {
    protected T[] vertices;
}


