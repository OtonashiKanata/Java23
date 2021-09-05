package pl.karolska.homework;

public class TicketSeller extends BaseEmployee {

    public TicketSeller(String nameAndSurname, int yearOfEmployment) {
        super(nameAndSurname, yearOfEmployment);
    }

    public TicketSeller(String nameAndSurname, int yearOfEmployment, double salary) {
        super(nameAndSurname, yearOfEmployment, salary);
    }

    public double calculateMonthlySalary() {
        return super.getBaseSalary();
    }
}



