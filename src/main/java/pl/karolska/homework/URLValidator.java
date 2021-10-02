package pl.karolska.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLValidator {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^(https?://)?(www\\.)?([\\w]+\\.)+[\\w]{2,3}$");
        Matcher matcher1 = pattern.matcher("http://www.google.pl");
        Matcher matcher2 = pattern.matcher("http://www.filmweb.pl");
        Matcher matcher3 = pattern.matcher("http://www.youtube.");


        System.out.println(matcher1.matches());
        System.out.println(matcher2.matches());
        System.out.println(matcher3.matches());

    }
}