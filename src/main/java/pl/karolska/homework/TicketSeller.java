package pl.karolska.homework;

public class TicketSeller extends BaseEmployee {

    public TicketSeller(String name, String surname, int employmentTime) {
        super(name, surname, employmentTime);
    }

    public TicketSeller(String name, String surname, int employmentTime, double salary) {
        super(name, surname, employmentTime, salary);
    }

    public double calculateMonthlySalary() {
        return super.getBaseSalary();
    }
}



