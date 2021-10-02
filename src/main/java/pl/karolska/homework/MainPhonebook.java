package pl.karolska.homework;

import java.util.NoSuchElementException;

public class MainPhonebook {

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.findEntry("Fryderyk Chopin");
        System.out.println();

        try {
            phonebook.findEntry("Cyprian Norwid");

        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());

        }
    }
}