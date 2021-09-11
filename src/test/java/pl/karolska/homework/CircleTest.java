package pl.karolska.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class CircleTest {
    private Circle circle;

    @Test
    void getAreaOfCircleWithRadius23() {

       circle = new Circle(23);


        double result = circle.getArea();
        Assertions.assertEquals(1661.9025137490005, result);

    }

    @Test
    void getAreaOfCircleWithRadius1() {

        circle = new Circle(1);


        double result = circle.getArea();
        Assertions.assertEquals(3.141592653589793, result);

    }

    @Test
    void getAreaOfCircleWithRadius32() {

        circle = new Circle(32);


        double result = circle.getArea();
        Assertions.assertEquals(3216.990877275948, result);

    }



    @Test
    void getPerimeterOfCircleWithRadius23() {

        circle = new Circle(23);


        double result = circle.getPerimeter();
        Assertions.assertEquals(144.51326206513048, result);
    }

    @Test
    void getPerimeterOfCircleWithRadius1() {

        circle = new Circle(1);


        double result = circle.getPerimeter();
        Assertions.assertEquals(6.283185307179586, result);
    }

    @Test
    void getPerimeterOfCircleWithRadius32() {

        circle = new Circle(32);


        double result = circle.getPerimeter();
        Assertions.assertEquals(201.06192982974676, result);
    }



}