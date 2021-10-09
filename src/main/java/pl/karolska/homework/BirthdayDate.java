package pl.karolska.homework;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class BirthdayDate {
    private LocalDate date;

    public BirthdayDate(LocalDate date) {
        this.date = date;
    }

    public int whatAgeAreYou() {
        return Period.between(date, LocalDate.now()).getYears();
    }

    public DayOfWeek whatWeekdayWereYouBorn() {
        return date.getDayOfWeek();
    }

    public int whatWeekWereYouBorn() {
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        return date.get(weekFields.weekOfWeekBasedYear());

    }

}