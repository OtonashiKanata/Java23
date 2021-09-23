package pl.karolska.homework;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class SearchForAWord {
    public static void main( String[] args ) throws IOException {

            System.out.println("Let's see if this file contains the word: ");

            Scanner scanner = new Scanner(System.in); {
                String word = scanner.next();
                String content = Files.readString(Paths.get(("src/main/java/pl/karolska/homework/data.txt")));

                System.out.println(content.contains(word));
        }

    }}
