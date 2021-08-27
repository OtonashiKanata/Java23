package pl.karolska;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.karolska.homework.Calculator;

class CalculatorTest {

    @Test
    void shoulSdummationWork() {

        int value1 = 5;
        int value2 = 5;

        int result = Calculator.add(value1, value2);

        Assertions.assertEquals(10, result);
    }

        @Test
        void shouldSubstractionWork() {

            int value1 = 10;
            int value2 = 5;

            int result = Calculator.substract(value1, value2);

            Assertions.assertEquals(5, result);
    }

        @Test
        void shouldMultiplicationWork() {

        int value1 = 5;
        int value2 = 5;

        int result = Calculator.multiply(value1, value2);

        Assertions.assertEquals(25, result);

    }

         @Test
         void shouldDivisionWork() {

             double value1 = 50;
             double value2 = 5;

             double result = Calculator.divide(value1, value2);

             Assertions.assertEquals(10, result);


         }

             @Test
             void shouldSummationWork2() {

                 int value1 = Integer.MIN_VALUE;
                 int value2 = 10;

                 int result = Calculator.add(value1, value2);

                 Assertions.assertEquals(-2147483638, result);
             }

             @Test
             void shouldSubstractionWork2() {

                 int value1 = Integer.MAX_VALUE;
                 int value2 = 5;

                 int result = Calculator.substract(value1, value2);

                 Assertions.assertEquals(2147483642, result);
             }

             @Test
             void shouldMultiplicationWork2() {

                 int value1 = Integer.MAX_VALUE;
                 int value2 = 1;

                 int result = Calculator.multiply(value1, value2);

                 Assertions.assertEquals(2147483647, result);

             }

             @Test
             void shouldDivisionWork2() {

                 double value1 = Integer.MAX_VALUE;
                 double value2 = 1;

                 double result = Calculator.divide(value1, value2);

                 Assertions.assertEquals(2147483647, result);

             }

    @Test
    void shouldSummationWork3() {

        int value1 = Integer.MAX_VALUE;
        int value2 = -100;

        int result = Calculator.add(value1, value2);

        Assertions.assertEquals(2147483547, result);
    }

    @Test
    void shouldSubstractionWork3() {

        int value1 = Integer.MIN_VALUE;
        int value2 = -500;

        int result = Calculator.substract(value1, value2);

        Assertions.assertEquals(-2147483148, result);
    }

    @Test
    void shouldMultiplicationWork3() {

        int value1 = Integer.MIN_VALUE;
        int value2 = -1;

        int result = Calculator.multiply(value1, value2);

        Assertions.assertEquals(-2147483648, result);

    }

    @Test
    void shouldDivisionWork3() {

        double value1 = 11;
        double value2 = 3;

        double result = Calculator.divide(value1, value2);

        Assertions.assertEquals(3.6666666666666665, result);

        }

    }
