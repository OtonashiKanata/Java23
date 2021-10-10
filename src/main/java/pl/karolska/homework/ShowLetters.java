package pl.karolska.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ShowLetters {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("I", "am", "sad", "that", "Java",
                "lessons", "with", "Future", "Collars", "are", "ending"));

        List<String> namesToUpperCase = names
                .stream()
                .map(String::toUpperCase)
                .map(ShowLetters::deleteDuplicates)
                .collect(Collectors.toList());

        namesToUpperCase.forEach(System.out::println);
    }

    public static String deleteDuplicates(String input) {
        StringBuilder sb = new StringBuilder();

        input
                .chars()
                .distinct()
                .forEach(c -> sb.append((char) c));

        return sb.toString();
    }
}