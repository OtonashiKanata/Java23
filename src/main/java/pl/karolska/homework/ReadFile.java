package pl.karolska.homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {

    public static void main(String[] args) throws IOException {

        String text = Files.readString(Paths.get("src/main/java/pl/karolska/homework/data.txt"));
        System.out.println(text);

    }

}