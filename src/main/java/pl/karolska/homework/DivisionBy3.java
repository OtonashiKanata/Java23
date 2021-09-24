package pl.karolska.homework;

public class DivisionBy3 {

    public static void Validate(int[] values) {

        for (int value : values) {
            try {
                if (value % 3 != 0) {
                    throw new IllegalArgumentException();

                }
            } catch (IllegalArgumentException e) {
                System.out.println(value + " can't be divided by 3 (without decimal numbers");
                continue;
            }

                int result = value / 3;
                System.out.println(value + "divided by 3 is " + result);
        }
    }
}