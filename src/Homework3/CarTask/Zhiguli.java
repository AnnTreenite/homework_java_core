package Homework3.CarTask;

public class Zhiguli extends Car {
    public Zhiguli (String specificName, String typeOfEngine, String typeOfTransmission, int gearTransmission) {
        this.model = specificName;
        this.engine = typeOfEngine;
        this.transmission = typeOfTransmission;
        this.transmissionSpeed = gearTransmission;
    }
    public void particularity () {
        System.out.println("она ломается");
    }
    public void driveTo() {
        System.out.println(this.model +" начал движение");
    }
    public void startSound() {
        System.out.println(this.model +" включил музыку");
    }
}
