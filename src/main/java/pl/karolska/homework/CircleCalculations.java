package pl.karolska.homework;

public class CircleCalculations implements AreaAndPerimeter {
    private double radius;

    public CircleCalculations(double radius) {
        this.radius = radius;

    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);

    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;


    }

}