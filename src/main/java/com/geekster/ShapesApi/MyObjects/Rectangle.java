package com.geekster.ShapesApi.MyObjects;

import com.geekster.ShapesApi.goodCode.iShape;

public class Rectangle implements iShape {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    @Override
    public String printArea() {

       double a = length*breadth;
        return String.valueOf(a);
    }
}
