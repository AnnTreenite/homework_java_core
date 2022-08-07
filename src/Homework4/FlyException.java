package Homework4;

public class FlyException extends Exception {
    public String messageTo;
    public FlyException(String s) {
        this.messageTo = s;
    }
    public String getMessageTo() {
        return messageTo;
    }
}
