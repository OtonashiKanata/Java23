package pl.karolska.homework;

public class Person implements Comparable<Person>{
    private final String name;
    private final String surname;
    private final int birthdate;
    private final int height;
    private final double weight;

    public Person(String name, String surname, int yearOfBirth, int height, double weight) {
        this.name = name;
        this.surname = surname;
        this.birthdate = yearOfBirth;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBirthdate() {
        return birthdate;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Person name: " + name + ",\t surname: " + surname + ",\t yearOfBirth: " + birthdate +
                ",\t height: " + height + ",\t weight: " + weight;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(o.getBirthdate(), this.birthdate);
    }
}