package pl.karolska.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeConversionTest {

    @Test
    public void should1Point50MinutesBe90Seconds() {
        double time = 1.50;

        double result = TimeConversion.conversionOfMinutesToSeconds(time);

        Assertions.assertEquals(result, 90);
    }

    @Test
    public void should59Point99MinutesBe3599Point4Seconds() {
        double time = 59.99;

        double result = TimeConversion.conversionOfMinutesToSeconds(time);

        Assertions.assertEquals(result, 3599.4);
    }

    @Test
    public void should0MinutesBe0Seconds() {
        double time = 0;

        double result = TimeConversion.conversionOfMinutesToSeconds(time);

        Assertions.assertEquals(result, 0);


    }
}