package pl.karolska.homework;

import java.util.*;

public class MainListOfNames {
    public static void showListWithoutDuplicates(List<String> list) {
        Set<String> set = new LinkedHashSet<>(list);
        List<String> listWithoutDuplicates = new ArrayList<>(set);

        System.out.println("List of names without duplicates: " + listWithoutDuplicates);
    }

    public static void showReversedList(List<String> list) {
        List<String> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);

        System.out.println("Reversed list of names: " + reversedList);
    }

    public static void replaceName(String toReplace, String replacement, List<String> list) {
        List<String> listWithReplacedElements = new ArrayList<>(list);
        ListIterator<String> iterator = listWithReplacedElements.listIterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if(next.equals(toReplace)) {
                iterator.set(replacement);

            }
        }

        System.out.println("List with replaced names: " + listWithReplacedElements);
    }
}