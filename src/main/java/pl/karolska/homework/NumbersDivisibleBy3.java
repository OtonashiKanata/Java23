package pl.karolska.homework;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumbersDivisibleBy3 {
    public static List<Integer> filterNumbers(int from, int to) {
        return IntStream.range(from, to)
                .filter(num -> num % 3 == 0)
                .boxed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        filterNumbers(-32, 23).forEach(System.out::println);

    }
}