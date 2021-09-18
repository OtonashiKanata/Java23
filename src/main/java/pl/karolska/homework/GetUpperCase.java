package pl.karolska.homework;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GetUpperCase {
    public static void main(String[] args) throws IOException {

            File file = new File("output.txt");
            if (!file.exists()) {
                file.createNewFile();

                String content = Files.readString(Paths.get("src/main/java/pl/karolska/homework/data.txt"));
                Files.writeString(Paths.get("src/main/java/pl/karolska/homework/output.txt"), content.toUpperCase());

            }
        }
    }