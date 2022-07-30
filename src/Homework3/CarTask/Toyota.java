package Homework3.CarTask;

public class Toyota extends Car {
    public Toyota (String specificName, String typeOfEngine, String typeOfTransmission, int gearTransmission) {
        this.model = specificName;
        this.engine = typeOfEngine;
        this.transmission = typeOfTransmission;
        this.transmissionSpeed = gearTransmission;
    }

    public Toyota() {
        System.out.println("newcar");
    }

    public void  particularity () {
        System.out.println("включает музыку");
    }
    public void driveTo() {
        System.out.println(this.model +" начал движение");
    }
    public void startSound() {
        System.out.println(this.model +" включил музыку");
    }

}