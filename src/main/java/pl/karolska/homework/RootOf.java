package pl.karolska.homework;

public class RootOf {

    public static double calculateRootOfANumber(double num1) {
        if (num1 < 0) {
            throw new IllegalArgumentException();
        }
        return Math.sqrt(num1);
    }

    public static void main(String[] args) {

        System.out.println(calculateRootOfANumber(9));
        System.out.println(calculateRootOfANumber(5));
        System.out.println(calculateRootOfANumber(-5));

    }
}