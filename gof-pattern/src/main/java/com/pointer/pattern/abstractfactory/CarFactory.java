package com.pointer.pattern.abstractfactory;

public class CarFactory extends AbstractFactory {


    public static Car buildCar(CarType model, FuelType fuelType) {
        Car car = null;
        switch (model) {

            case HETCH:
                car = new Hetch();
                break;
            case SEDAN:
                car = new Sedan();
                break;
            case COUPE:
                car = new Coupe();
                break;
            default:
                System.out.println("Error- illegal statement");
        }
        return car;

    }

    @Override
    int checkEngine() {

        return 1;
    }
}
