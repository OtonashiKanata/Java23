package pl.karolska.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class RectangleTest {
    private Rectangle rectangle;

    @Test
    void getAreaOfRectangleWith23and32() {

        rectangle = new Rectangle(23, 32);


        double result = rectangle.getArea();
        Assertions.assertEquals(736.0, result);

    }

    @Test
    void getAreaOfRectangleWith1And2() {

        rectangle = new Rectangle(1, 2);


        double result = rectangle.getArea();
        Assertions.assertEquals(2.0, result);

    }

    @Test
    void getAreaOfRectangleWith9And99() {

        rectangle = new Rectangle(9, 99);


        double result = rectangle.getArea();
        Assertions.assertEquals(891.0, result);

    }



    @Test
    void getPerimeterOfRectangleWith23And32() {

        rectangle = new Rectangle(23, 32);


        double result = rectangle.getPerimeter();
        Assertions.assertEquals(110.0, result);
    }

    @Test
    void getPerimeterOfRectangleWith1And2() {

        rectangle = new Rectangle(1, 2);


        double result = rectangle.getPerimeter();
        Assertions.assertEquals(6.0, result);
    }

    @Test
    void getPerimeterOfRectangleWith9And99() {

        rectangle = new Rectangle(9, 99);


        double result = rectangle.getPerimeter();
        Assertions.assertEquals(216.0, result);
    }

}