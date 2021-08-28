package pl.karolska.example.hospital;

public abstract class Employee {
    protected String name;
    protected String surname;
    protected final double basicPayment = 1000;

    public abstract double earnPayment();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
