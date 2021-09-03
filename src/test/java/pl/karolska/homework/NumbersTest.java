package pl.karolska.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumbersTest {

    @Test
    void should17BeEven() {

        int num1 = 17;

        boolean result = Numbers.isTheNumberEven(num1);
        Assertions.assertEquals(false, result);
    }

    @Test
    void should17BeOdd() {

        int num1 = 17;

        boolean result = Numbers.isTheNumberOdd(num1);
        Assertions.assertEquals(true, result);
    }

    @Test
    void should12345678BeEven() {

        int num1 = 12345678;

        boolean result = Numbers.isTheNumberEven(num1);
        Assertions.assertEquals(true, result);
    }

    @Test
    void should87654321BeOdd() {

        int num1 = 87654321;

        boolean result = Numbers.isTheNumberOdd(num1);
        Assertions.assertEquals(true, result);
    }

    @Test
    void shouldNegative499BeEven() {

        int num1 = -499;

        boolean result = Numbers.isTheNumberEven(num1);
        Assertions.assertEquals(false, result);
    }

    @Test
    void should1Negative500BeOdd() {

        int num1 = 500;

        boolean result = Numbers.isTheNumberOdd(num1);
        Assertions.assertEquals(false, result);
    }


}