package pl.karolska.homework;

import java.time.Month;

public class MockitoWhatSeasonIsIt {
    public static String getWhichSeason(Month month) {
        if (month == null) {
            return "";
        }

        String season = "";
        switch (month) {
            case MARCH:
            case APRIL:
            case MAY:
                season = MockitoSeasons.Spring.toString();
                break;

            case JUNE:
            case JULY:
            case AUGUST:
                season = MockitoSeasons.Summer.toString();
                break;

            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                season = MockitoSeasons.Autumn.toString();

            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                season = MockitoSeasons.Winter.toString();
                break;

        }

        return season;

    }
}