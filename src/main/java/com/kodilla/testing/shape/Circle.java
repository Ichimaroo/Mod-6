package com.kodilla.testing.shape;

class Circle implements Shape {
    String name = "Circle";
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return name;
    }
    public double getField() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}