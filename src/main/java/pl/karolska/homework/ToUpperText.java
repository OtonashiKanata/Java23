package pl.karolska.homework;

public class ToUpperText implements TextFormatter{

    @Override
    public String formatText(String text) {
        return text.toUpperCase();

    }
}
