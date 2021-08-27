package pl.karolska;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.karolska.homework.Calculator;

class CalculatorTest {

    @Test
    void should5Minus5Be10() {

        int value1 = 5;
        int value2 = 5;

        int result = Calculator.add(value1, value2);

        Assertions.assertEquals(10, result);
    }

        @Test
        void should10PlusTo5Be5() {

            int value1 = 10;
            int value2 = 5;

            int result = Calculator.substract(value1, value2);

            Assertions.assertEquals(5, result);
    }

        @Test
        void should5Times5Be25() {

        int value1 = 5;
        int value2 = 5;

        int result = Calculator.multiply(value1, value2);

        Assertions.assertEquals(25, result);

    }

         @Test
         void should50DividedBy5Be10() {

             double value1 = 50;
             double value2 = 5;

             double result = Calculator.divide(value1, value2);

             Assertions.assertEquals(10, result);


         }

             @Test
             void shouldMinIntegerPlus10BeNegative2147483638() {

                 int value1 = Integer.MIN_VALUE;
                 int value2 = 10;

                 int result = Calculator.add(value1, value2);

                 Assertions.assertEquals(-2147483638, result);
             }

             @Test
             void shouldSMaxIntegerMinus5Be2147483642() {

                 int value1 = Integer.MAX_VALUE;
                 int value2 = 5;

                 int result = Calculator.substract(value1, value2);

                 Assertions.assertEquals(2147483642, result);
             }

             @Test
             void shouldMaxIntegerTimes1Be2147483647() {

                 int value1 = Integer.MAX_VALUE;
                 int value2 = 1;

                 int result = Calculator.multiply(value1, value2);

                 Assertions.assertEquals(2147483647, result);

             }

             @Test
             void shouldMaxIntegerDiviedBy1Be2147483647() {

                 double value1 = Integer.MAX_VALUE;
                 double value2 = 1;

                 double result = Calculator.divide(value1, value2);

                 Assertions.assertEquals(2147483647, result);

             }

    @Test
    void shouldMaxIntegerPlusNegative100Be2147483547() {

        int value1 = Integer.MAX_VALUE;
        int value2 = -100;

        int result = Calculator.add(value1, value2);

        Assertions.assertEquals(2147483547, result);
    }

    @Test
    void shouldMinIntegerMinusNegative500BeNegative2147483148() {

        int value1 = Integer.MIN_VALUE;
        int value2 = -500;

        int result = Calculator.substract(value1, value2);

        Assertions.assertEquals(-2147483148, result);
    }

    @Test
    void shouldMinIntegerTimesNegative1BeNegative2147483648() {

        int value1 = Integer.MIN_VALUE;
        int value2 = -1;

        int result = Calculator.multiply(value1, value2);

        Assertions.assertEquals(-2147483648, result);

    }

    @Test
    void should11DividedBy3Be3Point6666666666666665() {

        double value1 = 11;
        double value2 = 3;

        double result = Calculator.divide(value1, value2);

        Assertions.assertEquals(3.6666666666666665, result);

        }

    }
