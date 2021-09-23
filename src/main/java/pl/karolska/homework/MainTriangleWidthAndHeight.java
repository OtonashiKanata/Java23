package pl.karolska.homework;

public class MainTriangleWidthAndHeight {

    public static void main(String[] args) {

        TriangleWidthAndHeight triangle1 = new TriangleWidthAndHeight(5, 10);
        TriangleWidthAndHeight triangle2 = new TriangleWidthAndHeight(23, 32);
        TriangleWidthAndHeight triangle3 = new TriangleWidthAndHeight(999, 9999);
        TriangleWidthAndHeight triangle4 = new TriangleWidthAndHeight(1.5, 2.7);

        System.out.println(triangle1);
        System.out.println(triangle2);
        System.out.println(triangle3);
        System.out.println(triangle4);

    }

}
