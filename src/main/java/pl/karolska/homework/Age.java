package pl.karolska.homework;

public class Age {

    public static String ageVerification(int age1) {
        if (age1 >= 18) {
            return "You are over 18";

        } else {

            return "You are below 18";
        }

        }
        public static void main (String[]args){

            System.out.println(ageVerification(12));


        }


    }