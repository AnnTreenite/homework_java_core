package Homework2.BaseTask4;

public class Ferret {
    String name;
    private int age;

    public Ferret(String personName, int personAge) {
        this.name = personName;
        this.age = personAge;
    }
    public void goToWalk () {
        System.out.println("Go to walk " + this.name);
    }
    public void setCuteName (String newCuteName) {
        this.name = newCuteName;
    }

}
