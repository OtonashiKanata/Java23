package pl.karolska.homework;

import java.util.Arrays;

public class RectangularTriangle {
    public static boolean isRectangular(int A, int B, int C) {
        int[] sides = new int[] {A, B, C};
        Arrays.sort(sides);
        return sides[2] * sides[2] == sides[0] * sides[0] + sides[1] * sides[1];

    }

}