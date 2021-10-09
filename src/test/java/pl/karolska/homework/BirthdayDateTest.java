package pl.karolska.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.DayOfWeek;
import java.time.LocalDate;

class BirthdayDateTest {
    BirthdayDate date = new BirthdayDate(LocalDate.of(1993, 03, 15));

    @Test
    void shouldVerifyAge() {

        int age = date.whatAgeAreYou();
        Assertions.assertEquals(28, age);
    }

    @Test
    void shouldVerifyBirthdayDayOfWeek() {

        DayOfWeek day = date.whatWeekdayWereYouBorn();
        Assertions.assertEquals(DayOfWeek.MONDAY, day);
    }

    @Test
    void shouldVerifyBirthdayWeekNumber() {

        int week = date.whatWeekWereYouBorn();
        Assertions.assertEquals(11, week);
    }
}