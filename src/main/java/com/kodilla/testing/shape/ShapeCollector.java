package com.kodilla.testing.shape;


import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape){
        if (shape != null)
            shapes.add(shape);
    }
    public boolean removeFigure(Shape shape){
        return shapes.remove(shape);
    }
    public Shape getFigure(int n){
        return shapes.get(n);
    }

    public void showFigures(){
        System.out.println(shapes.toString());
    }
}
