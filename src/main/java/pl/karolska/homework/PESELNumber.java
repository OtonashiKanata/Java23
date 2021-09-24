package pl.karolska.homework;


public class PESELNumber {

    public static String PESELValidation(String PESEL) {
        if (!(PESEL.matches("[0-9]+"))) {
            throw new WrongTypeOfDataException("Please only write your PESEL number.");
        }

        if (PESEL.length() != 11) {
            throw new IllegalLengthException("PESEL number should have 11 characters.");

        }
        return "Your PESEL number has been recorded.";
    }


    public static void main(String[] args) {

        System.out.println(PESELValidation("01234567890"));
        System.out.println(PESELValidation("0123456789"));
        System.out.println(PESELValidation("let me out"));

    }
}
