package com.kodilla.testing.shape;

public class Square implements Shape{
    String name = "Square";
    double edgeLength;
    public String getShapeName() {
        return name;
    }
    public Square(double edgeLength) {
        this.edgeLength = edgeLength;
    }
    public double getField() {
        return edgeLength * edgeLength;
    }

    @Override
    public String toString() {
        return "Square{" +
                "edgeLength=" + edgeLength +
                '}';
    }
}
