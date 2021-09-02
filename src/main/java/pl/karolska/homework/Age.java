package pl.karolska.homework;

public class Age {

    public static boolean ageVerification(int age1) {
        if (age1 >= 18) {
            return true;

        } else {

            return false;
        }

    }
    public static void main (String[]args){

        System.out.println("Are you over 18 years old? " + ageVerification(17));

    }

}