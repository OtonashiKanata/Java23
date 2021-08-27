package pl.karolska.homework;

public class Numbers {

    public static boolean areNumbersEven(int num1) {

        if (num1 % 2 == 0) {
            return true;
      }
    else {
        return false;
        }
    }

    public static boolean areNumbersOdd(int num1){

        if (num1 % 2 != 0) {
             return true;
    }
    else {
        return false;
        }
    }
    public static void main( String[] args ){

        System.out.println(areNumbersEven(8));
        System.out.println(areNumbersOdd(8));


    }
}
