package Homework4;

public class Base {
    public static void main(String[] args) {
        Flying[] array = {new Duck(false), new Duck(true), new Airplane(10), new Airplane(-1)};
        for (Flying flying : array) {
            try {
                flying.flies();
        } catch (FlyException e) {
                System.out.println(e.messageTo);
            }
        }
    }
}
