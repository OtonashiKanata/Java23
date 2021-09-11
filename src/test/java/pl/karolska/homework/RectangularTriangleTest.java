package pl.karolska.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void shouldBeNotRectangular() {
        int A = 1;
        int B = 3;
        int C = 2;
        boolean isItRectangular = RectangularTriangle.isRectangular(A, B, C);

        Assertions.assertFalse(isItRectangular);
    }

    @Test
    void shouldBeRectangular() {
        int A = 25;
        int B = 20;
        int C = 15;
        boolean isItRectangular = RectangularTriangle.isRectangular(A, B, C);

        Assertions.assertTrue(isItRectangular);
    }

    @Test
    void shouldNotBeRectangular2() {
        int A = 143441;
        int B = 42414;
        int C = 14557;
        boolean isItRectangular = RectangularTriangle.isRectangular(A, B, C);

        Assertions.assertFalse(isItRectangular);



    }
}