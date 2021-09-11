package pl.karolska.homework;

public class RectangleCalculations implements AreaAndPerimeter {
    private double height;
    private double width;

    public RectangleCalculations(double height, double width) {
        this.height = height;
        this.width = width;

    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * height;

    }

}