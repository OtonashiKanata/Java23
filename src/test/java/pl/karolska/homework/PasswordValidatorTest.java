package pl.karolska.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class PasswordValidatorTest {

    @ParameterizedTest
    @MethodSource("exampleGoodPasswords")
    void shouldVerifyGoodPasswords(String password) {
        //given, when
        boolean isValid = PasswordValidator.validation(password);
        //then
        Assertions.assertTrue(isValid);
    }

    @ParameterizedTest
    @MethodSource("exampleBadPasswords")
    void shouldNotVerifyBadPasswords(String password) {
        //given, when
        boolean isValid = PasswordValidator.validation(password);
        //then
        Assertions.assertFalse(isValid);
    }

    static Stream<String> exampleGoodPasswords() {
        return Stream.of(
                "Polska11",
                "Kar0lina",
                "AaaKotki2"

        );
    }

    static Stream<String> exampleBadPasswords() {
        return Stream.of(
                "password",
                "123456",
                "admin"

        );
    }
}