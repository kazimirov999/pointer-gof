package com.pointer.pattern.abstractfactory;

public class Sedan extends Car {
    Sedan(){
        super(CarType.SEDAN,FuelType.DIESEL);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Creating DIESEL`s Sedan");
    }

    @Override
    public String toString() {
        return "Sedan{DIESEL, GASOLINE, HYBRID}";
    }
}
