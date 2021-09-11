package pl.karolska.homework;

public class Triangle extends Shape{
    private double A;
    private double B;
    private double C;

    public Triangle(double sideA, double sideB, double sideC) {
        this.A = sideA;
        this.B = sideB;
        this.C = sideC;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - A) * (p - B) * (p - C));
    }

    @Override
    public double getPerimeter() {
        return A + B + C;

    }
}