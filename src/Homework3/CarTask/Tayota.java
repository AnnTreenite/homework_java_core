package Homework3.CarTask;

public class Tayota extends Car {

    public void  particularity () {
        System.out.println("включает музыку");
    }
    String model;
    String engine;
    String transmission;
    int transmissionSpeed;
    public Tayota (String specificName, String typeOfEngine, String typeOfTransmission, int gearTransmission) {
        this.model = specificName;
        this.engine = typeOfEngine;
        this.transmission = typeOfTransmission;
        this.transmissionSpeed = gearTransmission;
    }
}