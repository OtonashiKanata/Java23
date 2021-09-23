package pl.karolska.homework;

public class BillCalculator {

    public static double calculate(double bill, double service) {
        return bill + service;

    }

    public static double calculate(double bill, double service, int discount) {
        return calculate(bill, service) - discount;

    }

    public static double calculate(double bill, double service, double takeout) {
        return calculate(bill, service) + takeout;


    }
}
