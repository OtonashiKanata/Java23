package pl.karolska.homework;

public class MockitoTextLength {

    public static int getTextLength(String text) {
        if (text == null) {
            return 0;
        }
        return text.length();

    }
}