package pl.karolska.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PESELValidator {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d{11}");
        Matcher matcher = pattern.matcher("99999999999");

        boolean matches = matcher.matches();

    }
}