package pl.karolska.homework;

public class Weekdays {

    public static String printDayOfWeek (int dayOfWeek) {
        String weekdays;
        switch (dayOfWeek) {
            case 1:
                weekdays = "Monday";
                break;
            case 2:
                weekdays = "Tuesday";
                break;
            case 3:
                weekdays = "Wednesday";
                break;
            case 4:
                weekdays = "Thursday";
                break;
            case 5:
                weekdays = "Friday";
                break;
            case 6:
            case 7:
                weekdays = "Weekend";
                break;
            default:
                weekdays = "There is no such a day!";
                break;


        }

        return weekdays;

    }

    public static void main( String[] args ){

        System.out.println(printDayOfWeek(1));
        System.out.println(printDayOfWeek(7));
        System.out.println(printDayOfWeek(10));





    }
}


