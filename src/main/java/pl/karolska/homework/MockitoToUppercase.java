package pl.karolska.homework;

public class MockitoToUppercase {

    public static String getUppercase(String text) {
        if (text == null) {
            return "";
        }

        return text.toUpperCase();

    }
}

