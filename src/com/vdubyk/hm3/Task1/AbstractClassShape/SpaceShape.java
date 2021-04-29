package com.vdubyk.hm3.Task1.AbstractClassShape;


import com.vdubyk.hm3.Task1.Interface.AreaMeasurable;
import com.vdubyk.hm3.Task1.Interface.VolumeMeashurable;
import com.vdubyk.hm3.Task1.Vertex.Vertex3D;

public abstract class SpaceShape extends Shape<Vertex3D> implements AreaMeasurable, VolumeMeashurable {
}
