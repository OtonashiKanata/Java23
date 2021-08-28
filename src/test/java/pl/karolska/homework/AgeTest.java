package pl.karolska.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeTest {

    @Test
    void shouldReturnBelow18WhenAgeIs17() {

        String result = Age.ageVerification(17);
        Assertions.assertEquals("You are below 18", result);
    }

    @Test
    void shouldReturnOver18WhenAgeIs99() {

        String result = Age.ageVerification(99);
        Assertions.assertEquals("You are over 18", result);
    }

    @Test
    void shouldReturnBelow18WhenAgeIs2() {

        String result = Age.ageVerification(2);
        Assertions.assertEquals("You are below 18", result);

    }
}