package pl.karolska.homework;

import java.util.Calendar;

public abstract class BaseEmployee {

    private String nameAndSurname;
    private final int employmentTime;
    private final double salary;
    protected final static double defaultSalary = 3000.0;

    public BaseEmployee(String nameAndSurname, int employmentTime) {
        this(nameAndSurname, employmentTime, defaultSalary);
    }


    public BaseEmployee(String nameAndSurname, int employmentTime, double salary) {
        this.nameAndSurname = nameAndSurname;
        this.employmentTime = employmentTime;
        this.salary = salary;
    }

    public double getBaseSalary() {
        return salary;
    }

    public int getEmploymentTime() {
        return Calendar.getInstance().get(Calendar.YEAR) - employmentTime;
    }

    public abstract double calculateMonthlySalary();

    @Override
    public String toString() {
        return "BaseEmployee{" +
                "name='" + nameAndSurname + '\'' +
                ", salary=" + salary +
                ", yearOfEmployment=" + employmentTime +
                '}';


    }


}



