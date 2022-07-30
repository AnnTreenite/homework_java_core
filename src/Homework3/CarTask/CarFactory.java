package Homework3.CarTask;

public class CarFactory {
    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        Zhiguli zhiguli = new Zhiguli();

//        int[] Toyota = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 , 16, 17, 18, 19, 20};
//        int[] Zhiguli = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 , 16, 17, 18, 19, 20};
        Car[] carsArray = new Car[20];
        carsArray[i] = CarFactory.createToyota();

        Car[] cars = {toyota, zhiguli};
        for (Car car : cars) {
            Car car1 = (Car) car;
            car1.theyExist();
        }
    }
}
