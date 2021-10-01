package pl.karolska.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

class MockitoToUppercaseTest {

    @ParameterizedTest
    @ValueSource(strings = {"guinea pig", "abcd", "Amadeusz Mozart"})
    void shouldTextBeConvertedToUppercase(String input) {

        String expected = input.toUpperCase();
        String actual = MockitoToUppercase.getUppercase(input);

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @NullAndEmptySource
    void shouldBeEmpty(String input) {

        String expected = "";
        String actual = MockitoToUppercase.getUppercase(input);

        Assertions.assertEquals(expected, actual);

    }
}