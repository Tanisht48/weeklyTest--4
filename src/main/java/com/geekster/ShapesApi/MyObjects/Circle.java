package com.geekster.ShapesApi.MyObjects;

import com.geekster.ShapesApi.goodCode.iShape;

public class Circle implements iShape {
private int radius;

    public int getRadius() {
        return radius;

    }

    public void setRadius(int radius) {
        this.radius = radius;

    }

    public Circle(int radius) {
        this.radius = radius;
        System.out.println("Inside the Circle constructor");
    }

    @Override
    public String printArea() {
        double a = 3.14*getRadius()*getRadius();
        return String.valueOf(a);
    }
}
