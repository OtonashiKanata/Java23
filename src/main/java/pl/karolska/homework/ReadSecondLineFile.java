package pl.karolska.homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadSecondLineFile {

    public static void main(String[] args) throws IOException {

        Path file = Paths.get("src/main/java/pl/karolska/homework/data.txt");
        long countLines = Files.lines(file).count();
        int n = 0;
        while (n < countLines) {

            String line = Files.readAllLines(Paths.get("src/main/java/pl/karolska/homework/data.txt")).get(n);
            System.out.println(line);
            n = n + 2;
        }
    }
}