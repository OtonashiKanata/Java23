package pl.karolska.homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InvertedText {
    public static void main( String[] args ) throws IOException {

            String content = Files.readString(Paths.get("src/main/java/pl/karolska/homework/data.txt"));
            StringBuilder sb = new StringBuilder(content);

            System.out.println(sb.reverse());

        }
    }
