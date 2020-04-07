package com.pointer.pattern.abstractfactory;

import static com.pointer.pattern.abstractfactory.CarFactory.buildCar;

/**
 * Hello world!
 */
public class App {

    public static void main(String... args) {
        System.out.println(buildCar(CarType.HETCH, FuelType.GASOLINE));
        System.out.println(buildCar(CarType.SEDAN, FuelType.DIESEL));
        System.out.println(buildCar(CarType.COUPE, FuelType.HYBRID));
    }
}