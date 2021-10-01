package pl.karolska.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;
import java.util.stream.Stream;

class MockitoTextLengthTest {

    @ParameterizedTest
    @MethodSource({"methodSource"})
    void shouldVerifyTextLength(String input, int expected) {

        int actual = MockitoTextLength.getTextLength(input);

        Assertions.assertEquals(expected, actual);

    }

    private static Stream<Arguments> methodSource() {
        return Stream.of(
                Arguments.of("abcdefghijklmnoprs", 18),
                Arguments.of("Amadeusz Mozart", 15),
                Arguments.of("", 0)
        );
    }


    @ParameterizedTest
    @NullSource
    void shouldReturnZeroLength (String input){

        int actual = MockitoTextLength.getTextLength(input);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }
}