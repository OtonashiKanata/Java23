package pl.karolska.homework;

public class Numbers {

    public static boolean isTheNumberEven(int num1){

        return num1 % 2 == 0;

        }

        public static boolean isTheNumberOdd(int num1){

            return num1 % 2 != 0;

        }

        public static void main (String[]args ){

         System.out.println(isTheNumberEven(8));
         System.out.println(isTheNumberOdd(8));


            }
        }
