package Homework3.CarTask;

public class CarShop {
    public static void main(String[] args) {
        Toyota prius = new Toyota("Prius Prime", "Hybrid","ECVT",1);
        Toyota rav4 = new Toyota("rav4 LE", "Gasoline", "TV-AWD", 8);
        rav4.particularity();
        prius.particularity();
        rav4.driveTo();

        Zhiguli VAZ2101 = new Zhiguli("kopeika", "Gasoline", "Manual", 4);
        Zhiguli VAZ2106 = new Zhiguli("shesterka", "Gasoline", "Manual", 4);
        VAZ2101.particularity();
        VAZ2106.particularity();
        VAZ2101.startSound();
    }

}
