package pl.karolska.homework;

import java.util.Objects;

public class PersonObject {
    private final String name;
    private final String surname;
    private final int birthDate;


    public PersonObject(String name, String surname, int birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;


    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBirthDate() {
        return birthDate;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonObject PersonObject = (PersonObject) o;
        return birthDate == PersonObject.birthDate;

    }

    @Override
    public int hashCode() {
        return Objects.hash(birthDate);


    }

    @Override
    public String toString() {
        return name + "/" + surname + "/" + birthDate;

    }
}