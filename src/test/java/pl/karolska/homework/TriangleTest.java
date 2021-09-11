package pl.karolska.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class TriangleTest {

    private Triangle triangle;


    @Test
    void getAreaOfTriangleWith23And32And23() {

        triangle = new Triangle(23, 32, 23);


        double result = triangle.getArea();
        Assertions.assertEquals(264.36338626973287, result);

    }

    @Test
    void getAreaOfTriangleWith25And20And30() {

        triangle = new Triangle(25, 20, 30);


        double result = triangle.getArea();
        Assertions.assertEquals(248.03918541230536, result);

    }

    @Test
    void getAreaOfTriangleWith88And99And77() {

        triangle = new Triangle(88, 99, 77);


        double result = triangle.getArea();
        Assertions.assertEquals(3246.7707033296947, result);

    }


    @Test
    void getPerimeterOfTriangleWith23And32And23() {

        triangle = new Triangle(23, 32, 23);


        double result = triangle.getPerimeter();
        Assertions.assertEquals(78.0, result);
    }

    @Test
    void getPerimeterOfTriangleWith25And20And30() {

        triangle = new Triangle(25, 20, 30);


        double result = triangle.getPerimeter();
        Assertions.assertEquals(75.0, result);
    }

    @Test
    void getPerimeterOfTriangleWith88And99And77() {

        triangle = new Triangle(88, 99, 77);


        double result = triangle.getPerimeter();
        Assertions.assertEquals(264.0, result);
    }

}