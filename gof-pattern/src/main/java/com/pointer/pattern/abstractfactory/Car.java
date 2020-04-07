package com.pointer.pattern.abstractfactory;

public abstract class Car {

    protected abstract void construct();

    public Car(CarType model, FuelType fuelType) {
        this.model = model;
        this.fuelType = fuelType;
    }

    private CarType model = null;
    private FuelType fuelType = null;

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }
}
