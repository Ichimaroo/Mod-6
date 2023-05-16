package com.kodilla.testing.shape;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("Test addFigure")
    class TestAddFigure {

        @Test
        void testAddFigure() {

            Circle circle = new Circle(30.0);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(circle);
            assertTrue(circle == shapeCollector.getFigure(0));

            Triangle triangle = new Triangle(30, 50, 66);
            shapeCollector.addFigure(triangle);
            assertTrue(circle == shapeCollector.getFigure(0));
            assertTrue(triangle == shapeCollector.getFigure(1));

            Square square = new Square(20);
            shapeCollector.addFigure(square);
            assertTrue(circle == shapeCollector.getFigure(0));
            assertTrue(triangle == shapeCollector.getFigure(1));
            assertTrue(square == shapeCollector.getFigure(2));
        }

        @Test
        void testAddFigureNull() {
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(null);
            shapeCollector.addFigure(new Square(35));
            assertTrue(null != shapeCollector.getFigure(0));
        }

    }
    @Nested
    @DisplayName("Test removeFigure")
    class TestRemoveFigure {
        @Test
        void testRemoveFigureExisting() {
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(20);
            Square square1 = new Square(20);
            Square square2 = new Square(21);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(square1);
            shapeCollector.addFigure(square2);
            shapeCollector.removeFigure(square1);
            assertEquals(square2, shapeCollector.getFigure(1));
            assertEquals(square, shapeCollector.getFigure(0));
        }
        @Test
        void testRemovenonexisting() {
                ShapeCollector shapeCollector = new ShapeCollector();
                Square square = new Square(20);
                Square square1 = new Square(20);
                Square square2 = new Square(21);
                shapeCollector.addFigure(square);
                shapeCollector.addFigure(square1);
                shapeCollector.addFigure(square2);
                shapeCollector.removeFigure(new Square(22));
                assertTrue(square2 == shapeCollector.getFigure(2));
                assertTrue(square1 == shapeCollector.getFigure(1));
                assertTrue(square == shapeCollector.getFigure(0));
            }

        }
    @Nested
    @DisplayName("Test getFigure")
    class TestGetFigure {

        @Test
        void testGetDifferentFigures() {
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(20);
            Circle circle = new Circle(30.0);
            Triangle triangle = new Triangle(30, 50, 66);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(circle);
            assertTrue(circle == shapeCollector.getFigure(2));
            assertTrue(triangle == shapeCollector.getFigure(1));
            assertTrue(square == shapeCollector.getFigure(0));
        }
    }
    @Nested
    @DisplayName("Test showFigures")
    class TestShowFigures {
        @Test
        void testShowFiguresNotEmpty() {
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(20);
            Circle circle = new Circle(30.0);
            Triangle triangle = new Triangle(30, 50, 66);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(circle);
            shapeCollector.showFigures();
        }
    }
}

