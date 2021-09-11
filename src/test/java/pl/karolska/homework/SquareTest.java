package pl.karolska.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class SquareTest {
    private Square square;


    @Test
    void getAreaOfSquareWithSide23() {

        square = new Square(23);


        double result = square.getArea();
        Assertions.assertEquals(529.0, result);

    }

    @Test
    void getAreaOfSquareWithSide1() {

        square = new Square(1);


        double result = square.getArea();
        Assertions.assertEquals(1.0, result);

    }

    @Test
    void getAreaOfSquareWithSide99() {

        square = new Square(99);


        double result = square.getArea();
        Assertions.assertEquals(9801.0, result);

    }



    @Test
    void getPerimeterOfSquareWithSide23() {

        square = new Square(23);


        double result = square.getPerimeter();
        Assertions.assertEquals(92.0, result);
    }

    @Test
    void getPerimeterOfSquareWithSide1() {

        square = new Square(1);


        double result = square.getPerimeter();
        Assertions.assertEquals(4.0, result);
    }

    @Test
    void getPerimeterOfSquareWithSide99() {

        square = new Square(99);


        double result = square.getPerimeter();
        Assertions.assertEquals(396, result);
    }

}