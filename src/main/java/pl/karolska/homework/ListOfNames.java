package pl.karolska.homework;

import java.util.ArrayList;
import java.util.List;

public class ListOfNames {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Katarzyna");
        names.add("Tymon");
        names.add("Tadeusz");
        names.add("Anna");
        names.add("Karolina");
        names.add("Dorota");
        names.add("Piotr");

        MainListOfNames.showListWithoutDuplicates(names);
        MainListOfNames.showReversedList(names);
        MainListOfNames.replaceName("Anna", "Joanna", names);
    }
}