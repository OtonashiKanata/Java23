package pl.karolska.homework;

public class TriangleWidthAndHeight {

    private double width;
    private double height;

    public TriangleWidthAndHeight(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle with the " +
                "width of " + width +
                " and height of " + height;
    }

}