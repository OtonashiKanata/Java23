package pl.karolska.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangleCalculationsTest {

    RectangleCalculations rectangleCalculations;

    @Test
    void getAreaOfRectangleWith123And123() {

        rectangleCalculations = new RectangleCalculations(123, 123);

        double result = rectangleCalculations.getPerimeter();

        Assertions.assertEquals(492.0, result);
    }

    @Test
    void getAreaOfRectangleWith50And15() {

        rectangleCalculations = new RectangleCalculations(50, 15);

        double result = rectangleCalculations.getPerimeter();

        Assertions.assertEquals(130.0, result);
    }

    @Test
    void getAreaOfRectangleWith1And2() {

        rectangleCalculations = new RectangleCalculations(1, 2);

        double result = rectangleCalculations.getPerimeter();

        Assertions.assertEquals(6.0, result);
    }



    @Test
    void getPerimeterOfRectangleWith123And123() {

        rectangleCalculations = new RectangleCalculations(123, 123);


        double result = rectangleCalculations.getArea();

        Assertions.assertEquals(15129.0, result);
    }

    @Test
    void getPerimeterOfRectangleWith50And15() {

        rectangleCalculations = new RectangleCalculations(50, 15);


        double result = rectangleCalculations.getArea();

        Assertions.assertEquals(750.0, result);
    }

    @Test
    void getPerimeterOfRectangleWith1And2() {

        rectangleCalculations = new RectangleCalculations(1, 2);


        double result = rectangleCalculations.getArea();

        Assertions.assertEquals(2.0, result);
    }


}