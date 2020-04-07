package com.pointer.pattern.abstractfactory;

public class Hetch extends Car {
    Hetch(){
        super(CarType.HETCH,FuelType.GASOLINE);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Creating GASOLINE`s Hetch ");
    }

    @Override
    public String toString() {
        return "Hetch{DIESEL, GASOLINE, HYBRID}";
    }
}
