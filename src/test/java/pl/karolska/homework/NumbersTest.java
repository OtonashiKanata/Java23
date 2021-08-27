package pl.karolska.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void should17BeEven() {

        boolean result = Numbers.areNumbersEven(17);
        Assertions.assertEquals(false, result);
    }

    @Test
    void should17BeOdd() {

        boolean result = Numbers.areNumbersOdd(17);
        Assertions.assertEquals(true, result);
    }

    @Test
    void should12345678BeEven() {

        boolean result = Numbers.areNumbersEven(12345678);
        Assertions.assertEquals(true, result);
    }

    @Test
    void should87654321BeOdd() {

        boolean result = Numbers.areNumbersOdd(87654321);
        Assertions.assertEquals(true, result);
    }

    @Test
    void shouldNegative499BeEven() {

        boolean result = Numbers.areNumbersEven(-499);
        Assertions.assertEquals(false, result);
    }

    @Test
    void should1Negative500BeOdd() {

        boolean result = Numbers.areNumbersOdd(-500);
        Assertions.assertEquals(false, result);
    }






}