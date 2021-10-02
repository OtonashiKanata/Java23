package pl.karolska.homework;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class MainPersonClass {
    public static void main(String[] args) {
        Set<Person> persons = new TreeSet<>();
        persons.add(new Person("Amadeusz", "Mozart", 1990, 170, 80.0));
        persons.add(new Person("Fryderyk", "Chopin", 1991, 171, 81.1));
        persons.add(new Person("Juliusz", "Slowacki", 1992, 172, 82.2));
        persons.add(new Person("Adam", "Mickiewicz", 1993, 173, 83.3));
        persons.add(new Person("Cyprian", "Norwid", 1994, 174, 84.4));

        System.out.println("Youngest to oldest (default): ");
        for (Person person : persons) {
            System.out.println(person.toString());
        }


    Set<Person> persons3 = new TreeSet<>(new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return Double.compare(o2.getWeight(), o1.getWeight());
        }
    });
        persons3.addAll(persons);
        System.out.println("\nFrom heaviest to lightest: ");
        for (Person person : persons3)

    {
        System.out.println(person.toString());

    }

        Set<Person> persons2 = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getHeight(), o2.getHeight());
            }
        });
        persons2.addAll(persons);

        System.out.println("\nFrom shortest to tallest: ");
        for (Person person : persons2) {
            System.out.println(person.toString());

        }
    }
}