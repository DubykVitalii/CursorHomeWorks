package com.vdubyk.hm3.Task1.AbstractClassShape;

import com.vdubyk.hm3.Task1.Interface.AreaMeasurable;
import com.vdubyk.hm3.Task1.Interface.PerimeterMeasurable;
import com.vdubyk.hm3.Task1.Vertex.Vertex2D;


public abstract class PlaneShape extends Shape<Vertex2D> implements PerimeterMeasurable, AreaMeasurable {

}