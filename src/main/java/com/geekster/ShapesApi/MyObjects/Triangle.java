package com.geekster.ShapesApi.MyObjects;

import com.geekster.ShapesApi.goodCode.iShape;

public class Triangle implements iShape {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String printArea() {

        double a = 0.5*getHeight()*getBase();

        return String.valueOf(a);
    }
}
