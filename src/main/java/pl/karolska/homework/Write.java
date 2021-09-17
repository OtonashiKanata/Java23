package pl.karolska.homework;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class Write {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File file = new File("src/main/java/pl/karolska/homework/data.txt");

        String textToFile = "Kurs\n" +
                "Java\n" +
                "Lekcja 6\n" +
                "Pliki\n" +
                "Wyjątki\n" +
                "Pliki\n" +
                "Koniec pliku\n";

        String text = Files.readString(Path.of("src/main/java/pl/karolska/homework/data.txt"));
        Files.writeString(Path.of("src/main/java/pl/karolska/homework/data.txt"), textToFile);


    }
}