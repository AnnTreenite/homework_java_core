package Homework4;

public class FlyException extends Exception {
    public String messageTo;
    public FlyException(String s) {
        this.messageTo = getMessage();
    }
    public String getMessageTo() {
        return messageTo;
    }
}
