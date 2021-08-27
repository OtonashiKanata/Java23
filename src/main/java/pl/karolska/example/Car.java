package pl.karolska.example;

public class Car {

    double mileage;
    int doors;
    String brand;
    String model;

    public Car (){

    }

    public Car (int doors, String brand, String model){
        this.doors = doors;
        this.brand = brand;
        this.model = model;
        this.mileage = -1000;

    }


    public void horn() {
        System.out.println("Biiip");
    }

    public double drive (double far){
        this.mileage += far;
        return this.mileage;

    }


}