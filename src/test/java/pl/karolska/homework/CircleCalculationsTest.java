package pl.karolska.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleCalculationsTest {

    CircleCalculations circleCalculations;

    @Test
    void getAreaOfCircleWith123() {

        circleCalculations = new CircleCalculations(123);

        double result = circleCalculations.getPerimeter();

        Assertions.assertEquals(772.8317927830891, result);
    }

    @Test
    void getAreaOfCircleWith50() {

        circleCalculations = new CircleCalculations(50);

        double result = circleCalculations.getPerimeter();

        Assertions.assertEquals(314.1592653589793, result);
    }

    @Test
    void getAreaOfCircleWith1() {

        circleCalculations = new CircleCalculations(1);

        double result = circleCalculations.getPerimeter();

        Assertions.assertEquals(6.283185307179586, result);
    }



    @Test
    void getPerimeterOfCircleWith123() {

        circleCalculations = new CircleCalculations(123);


        double result = circleCalculations.getArea();

        Assertions.assertEquals(47529.15525615998, result);
    }

    @Test
    void getPerimeterOfCircleWith50() {

        circleCalculations = new CircleCalculations(50);


        double result = circleCalculations.getArea();

        Assertions.assertEquals(7853.981633974483, result);
    }

    @Test
    void getPerimeterOfCircleWith1() {

        circleCalculations = new CircleCalculations(1);


        double result = circleCalculations.getArea();

        Assertions.assertEquals(3.141592653589793, result);
    }

}