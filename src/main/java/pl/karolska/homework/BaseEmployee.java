package pl.karolska.homework;

import java.util.Calendar;

public abstract class BaseEmployee {

    private String name;
    private String surname;
    private final int employmentTime;
    private final double salary;
    protected final static double DEFAULT_SALARY = 3000.0;

    public BaseEmployee(String name, String surname, int employmentTime) {
        this(name, surname, employmentTime, DEFAULT_SALARY);
    }


    public BaseEmployee(String name, String surname, int employmentTime, double salary) {
        this.name = name;
        this.surname = surname;
        this.employmentTime = employmentTime;
        this.salary = salary;
    }

    public double getBaseSalary() {
        return salary;
    }

    public int getEmploymentTime() {
        return Calendar.getInstance().get(Calendar.YEAR) - employmentTime;


    }


}






