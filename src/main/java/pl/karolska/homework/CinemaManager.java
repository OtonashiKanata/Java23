package pl.karolska.homework;

public class CinemaManager extends BaseEmployee {

    private double bonus;
    private final static double defaultSalary = 5000.0;
    private final static double defaultBonus = 500.0;

    public CinemaManager(String nameAndSurname, int employmentTime) {
        this(nameAndSurname, employmentTime, defaultSalary, defaultBonus);
    }

    public CinemaManager (String nameAndSurname, int employmentTime, double salary) {
        this(nameAndSurname, employmentTime, salary, defaultBonus);
    }

    public CinemaManager (String nameAndSurname, double bonus, int employmentTime) {
        this(nameAndSurname, employmentTime, defaultSalary, bonus);
    }

    public CinemaManager(String nameAndSurname, int employmentTime, double salary, double bonus) {
        super(nameAndSurname, employmentTime, salary);
        this.bonus = bonus;
    }

    public double calculateMonthlySalary() {
        return super.getBaseSalary() + this.bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;


    }


}




