package Homework2.BaseTask4;

public class zoo {
    public static void main(String[] args) {
        Fox ann = new Fox("Ann",40);
        System.out.println(ann.name);
        ann.whereIs();
        ann.setCuteName("Annie");
        ann.whereIs();

        Ferret george = new Ferret("George",5);
        george.goToWalk();
        george.setCuteName("Nospire");
        george.goToWalk();
    }
}
