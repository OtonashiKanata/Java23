package pl.karolska.homework;

public class Car implements Vehicle {
    private boolean engineStarted;


    public void startEngine() {
        if (!engineStarted) {
            engineStarted = true;
        }
    }


    public void stopEngine() {
        if (engineStarted) {
            engineStarted = false;
        }
    }

    public boolean isEngineStarted() {
        return engineStarted;
    }

    public void setEngineStarted(boolean engineStarted) {
        this.engineStarted = engineStarted;
    }


    public void turnLeft() {
        System.out.println("Turn on the left turn signal");
    }


    public void turnRight() {
        System.out.println("Turn on the right turn signal");
    }
}