package Homework2;

public class BaseTask3 {
    public static void main(String[] args) {
        boolean chicken = true;
        boolean vegetables = false;
        boolean sour = true;
        boolean toast = true;
        boolean sausage = true;
        boolean eggs = true;
        if (chicken && vegetables && sour && toast) {
            System.out.println("Caesar is ready");
        } else {
            if (vegetables && eggs && (sausage || chicken)) {
                System.out.println("Olivier is ready");
            } else {
                if (vegetables) {
                    System.out.println("Vegetables Salad is ready");
                } else {
                    System.out.println("Nothing to cook, sorry");
                }
            }
        }
    }
}
