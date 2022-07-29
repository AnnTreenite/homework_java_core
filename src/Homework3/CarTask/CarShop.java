package Homework3.CarTask;

public class CarShop {
    public static void main(String[] args) {
        Tayota prius = new Tayota("Prius Prime", "Hybrid","ECVT",1);
        Tayota rav4 = new Tayota("rav4 LE", "Gasoline", "TV-AWD", 8);
        rav4.particularity();
        prius.particularity();

        Zhiguli kopeika = new Zhiguli("VAZ 21-01", "Gasoline", "Manual", 4);
        Zhiguli shesterka = new Zhiguli("VAZ 2106", "Gasoline", "Manual", 4);
        kopeika.particularity();
        shesterka.particularity();
    }

}
