package Homework4;

public class Duck implements Flying {
    boolean shootDuck;

    public Duck(boolean isShoot) {
        this.shootDuck = isShoot;
    }

//    public void Duck() throws FlyException {
//        if (shootDuck) {
//            throw new FlyException();
//        }
//    }

    @Override
    public void flies() throws FlyException {
        if (shootDuck) {
            throw new FlyException("Error: The duck is shoot");
        }
            System.out.println("The Duck is flying");
        }
    }

