package pl.karolska.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static pl.karolska.homework.MockitoNumbers.isDivisibleBy2;

class MockitoNumbersTest {

    @ParameterizedTest
    @ValueSource(ints = {2, -32, 0, 123456})
    void shouldCheckIfDivisionBy2IsPossible(int input) {

        boolean MockitoNumbers = isDivisibleBy2(input);

        Assertions.assertTrue(isDivisibleBy2(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"2 : 2", "-32 : 5", "0 : 0", "123456 : 21"}, delimiter = ':')
    void shouldCheckSumOfDigits(String input, String expected) {

        int actualValue = Integer.parseInt(input);
        int expectedValue = Integer.parseInt(expected);

        actualValue = MockitoNumbers.sumOfDigits(actualValue);

        Assertions.assertEquals(expectedValue, actualValue);

    }
}