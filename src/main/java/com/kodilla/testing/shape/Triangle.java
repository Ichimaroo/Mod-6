package com.kodilla.testing.shape;

public class Triangle implements Shape {
    String name = "Triangle";
    double edgeLengthA;
    double edgeLengthB;
    double edgeLengthC;


    public Triangle(double edgeLengthA, double edgeLengthB, double edgeLengthC) {

        this.edgeLengthA = edgeLengthA;
        this.edgeLengthB = edgeLengthB;
        this.edgeLengthC = edgeLengthC;
    }
    public String getShapeName() {
        return name;
    }
    public double getField() {
        double p = (edgeLengthA + edgeLengthB + edgeLengthC) / 2;
        return Math.sqrt(p * (p - edgeLengthA) * (p - edgeLengthB) * (p - edgeLengthC));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "edgeLengthA=" + edgeLengthA +
                ", edgeLengthB=" + edgeLengthB +
                ", edgeLengthC=" + edgeLengthC +
                '}';
    }
}
