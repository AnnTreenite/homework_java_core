package Homework2.BaseTask4;

public class Fox {
    String name;
    private int height;

    public Fox(String personName, int personHeight) {
        this.name = personName;
        this.height = personHeight;
    }
    public void whereIs () {
        System.out.println("Where is the " + this.name);
    }
    public void setCuteName(String newCuteName) {
        this.name = newCuteName;
    }

}
