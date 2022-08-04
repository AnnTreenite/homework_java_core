package Homework4;

public class Airplane implements Flying {
    int countPassenger;
    public Airplane (int passenger) {
        this.countPassenger = passenger;
    }
    @Override
    public void flies() throws FlyException {
        if (countPassenger < 0) {
            throw new FlyException("Error: passenger less than 0");
        }
        System.out.println("The plane is flying");
    }
}
