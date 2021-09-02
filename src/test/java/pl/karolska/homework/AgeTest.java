package pl.karolska.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeTest {

    @Test
    void shouldReturnFalseWhenAgeIs17() {

        Boolean result = Age.ageVerification(17);
        Assertions.assertEquals(false, result);
    }

    @Test
    void shouldReturnTrueWhenAgeIs99() {

        Boolean result = Age.ageVerification(99);
        Assertions.assertEquals(true, result);
    }

    @Test
    void shouldReturnFalseWhenAgeIs2() {

        Boolean result = Age.ageVerification(2);
        Assertions.assertEquals(false, result);

    }
}