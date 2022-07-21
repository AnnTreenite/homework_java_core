package Homework2;

public class BaseTask2 {
    public static void main(String[] args) {
        int ageChildren = 16; {
            if (ageChildren > 0 && ageChildren <= 6) {
                System.out.println("go to kindergarten");
            }
            else {
                if (ageChildren > 6 && ageChildren <= 11) {
                    System.out.println("go Primary School");
                }
                else {
                    if (ageChildren > 11 && ageChildren <= 17) {
                        System.out.println("go to Secondary School");
                    } else {
                        if (ageChildren > 17 && ageChildren < 100) {
                            System.out.println("go to University, or find work");
                        }
                    }
                }
            }
        }
    }
}
