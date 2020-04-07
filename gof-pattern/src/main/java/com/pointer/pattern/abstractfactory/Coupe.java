package com.pointer.pattern.abstractfactory;

public class Coupe extends Car {
    Coupe() {
        super(CarType.COUPE, FuelType.HYBRID);
        construct();

    }

    @Override
    protected void construct() {
        System.out.println("Creating HYBRID  Coupe");
    }

    @Override
    public String toString() {
        return "Coupe{DIESEL, GASOLINE, HYBRID}";
    }
}
