package pl.karolska.homework;

public class CinemaManager extends BaseEmployee {

    private double bonus;
    private final static double DEFAULT_SALARY = 5000.0;
    private final static double DEFAULT_BONUS = 500.0;

    public CinemaManager(String name, String surname, int employmentTime) {
        this(name, surname, employmentTime, DEFAULT_SALARY, DEFAULT_BONUS);
    }

    public CinemaManager (String name, String surname, int employmentTime, double salary) {
        this(name, surname, employmentTime, salary, DEFAULT_BONUS);
    }

    public CinemaManager (String name, String surname, double bonus, int employmentTime) {
        this(name, surname, employmentTime, DEFAULT_SALARY, bonus);
    }

    public CinemaManager(String name, String surname, int employmentTime, double salary, double bonus) {
        super(name, surname, employmentTime, salary);
        this.bonus = bonus;
    }

    public double calculateMonthlySalary() {
        return super.getBaseSalary() + this.bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;


    }


}




