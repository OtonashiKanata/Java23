package pl.karolska.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ChoosingNumbersTest {

    @ParameterizedTest
    @ValueSource(strings = {"342", "756", "3457", "87", "3", "5"})
    void shouldChooseNumbers(String number) {

        boolean isInt = ChoosingNumbers.isInt(number);
        boolean isDouble = ChoosingNumbers.isDouble(number);
        boolean isInScientificNotation = ChoosingNumbers.isInScientificNotation(number);

        Assertions.assertTrue(isInt);
        Assertions.assertFalse(isDouble);
        Assertions.assertFalse(isInScientificNotation);

    }

    @ParameterizedTest
    @ValueSource(strings = {"5.34", "6.09", "1.0001"})
    void shouldChooseDoubleNumbers(String number) {

        boolean isDouble = ChoosingNumbers.isDouble(number);
        boolean isInt = ChoosingNumbers.isInt(number);
        boolean isInScientificNotation = ChoosingNumbers.isInScientificNotation(number);

        Assertions.assertTrue(isDouble);
        Assertions.assertFalse(isInt);
        Assertions.assertFalse(isInScientificNotation);
    }


    @ParameterizedTest
    @ValueSource(strings = {"1.234e+07", "7.234243E-02"})
    void shouldChooseNumbersInScientificNotation(String number) {

        boolean isInScientificNotation = ChoosingNumbers.isInScientificNotation(number);
        boolean isDouble = ChoosingNumbers.isDouble(number);
        boolean isInt = ChoosingNumbers.isInt(number);

        Assertions.assertTrue(isInScientificNotation);
        Assertions.assertFalse(isInt);
        Assertions.assertFalse(isDouble);
    }

}