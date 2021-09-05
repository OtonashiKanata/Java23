package pl.karolska.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekdaysTest {

    @Test
    void shouldThe2ndDayBeTuesday() {

        String result = Weekdays.printDayOfWeek(2);
        Assertions.assertEquals("Tuesday", result);
    }
    @Test
    void shouldThe8thDayBeError() {

        String result = Weekdays.printDayOfWeek(8);
        Assertions.assertEquals("There is no such a day!", result);

    }

    @Test
    void shouldThe7thDayBeWeekend() {

        String result = Weekdays.printDayOfWeek(7);
        Assertions.assertEquals("Weekend", result);

    }


}
