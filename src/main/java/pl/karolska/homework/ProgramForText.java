package pl.karolska.homework;

public class ProgramForText {

    public static boolean isContainingLetters(String text) {
        if (text.length() != 0);
        return true;

    }

    public static boolean isAPalindrome(String text) {
        if (text.length() != 0);
        StringBuilder stringBuilder = new StringBuilder(text);
        stringBuilder.reverse();
        String reversedText = stringBuilder.toString();
        return text.equals(reversedText);

    }

    public static int lengthOfText(String text) {
        if (text.length() != 0) ;
        return text.length();


    }

        public static void main(String[] args){

            System.out.println(isContainingLetters("Reviver"));
            System.out.println(isAPalindrome("Reviver"));
            System.out.println(lengthOfText("Reviver"));

    }
}