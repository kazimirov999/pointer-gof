package com.pointer.pattern.abstractfactory;

public class ReginaFactory extends AbstractFactory {
    Bottle createBottle() {
        return new ReginaBottle();
    }

    Water createWater() {
        return new ReginaWater();
    }
}
