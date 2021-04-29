package com.vdubyk.hm2;

public class Car {
    private String name;
    boolean engineStatus=false;

    public Car(String name) {
        this.name = name;
    }

    public void startEngineCar() {
        if(!engineStatus) {
            System.out.println("Start engine " + name);
            engineStatus=true;
        } else System.out.println("Engine already started");
    }

    public void stopEngineCar() {
        if(engineStatus) {
            System.out.println("Stop engine " + name);
            engineStatus=false;
        } else System.out.println("Engine already stopped");
    }

    public void goCar() {
        System.out.println(name + " goes");
    }

    public void goCarStaticSpeed(int staticSpeed) {
        System.out.println(name + " goes at a speed of " + staticSpeed);
    }
}
