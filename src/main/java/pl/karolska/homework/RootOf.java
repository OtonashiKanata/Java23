package pl.karolska.homework;

public class RootOf {

    public static double RootOfANumber(double num1) {
        if (num1 < 0) {
            throw new IllegalArgumentException();
        }
        return Math.sqrt(num1);
    }

    public static void main(String[] args) {

        System.out.println(RootOfANumber(9));
        System.out.println(RootOfANumber(5));
        System.out.println(RootOfANumber(-5));

    }
}