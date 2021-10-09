package pl.karolska.homework;

import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    private static String currentYear = String.valueOf(LocalDateTime.now().getYear());
    private static String year = currentYear.substring(2,4);
    private static final Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=\\S+$).{7,}$");


    public static boolean validation(String password) {
        if (password.contains(currentYear) || password.contains(year)) {
            return false;

        } else {
            Matcher matcher = pattern.matcher(password);
            return matcher.matches();

        }

    }
}