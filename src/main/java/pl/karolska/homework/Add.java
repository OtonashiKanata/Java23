package pl.karolska.homework;

public class Add implements UpdatedCalculator {

    @Override
    public double calculate(double ...values) {
        double summation = 0;
        for(double value: values) {
            summation += value;
        }

        return summation;

    }

}