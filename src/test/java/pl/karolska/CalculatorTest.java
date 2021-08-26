package pl.karolska;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.karolska.homework.Calculator;

class CalculatorTest {

    @Test
    void doesSummationWork() {

        int value1 = 5;
        int value2 = 5;

        int result = Calculator.add(value1, value2);

        Assertions.assertEquals(10, result);
    }

        @Test
        void doesSubstractionWorks() {

            int value1 = 10;
            int value2 = 5;

            int result = Calculator.substract(value1, value2);

            Assertions.assertEquals(5, result);
        }

    @Test
    void doesMultiplicationWorks() {

        int value1 = 5;
        int value2 = 5;

        int result = Calculator.multiply(value1, value2);

        Assertions.assertEquals(25, result);

    }

    @Test
    void doesDivisionWorks() {

        double value1 = 50;
        double value2 = 5;

        double result = Calculator.divide(value1, value2);

        Assertions.assertEquals(10, result);


        }

    }
