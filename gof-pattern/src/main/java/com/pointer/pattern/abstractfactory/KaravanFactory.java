package com.pointer.pattern.abstractfactory;

public class KaravanFactory extends AbstractFactory {
    Bottle createBottle() {
        return new KaravanBottle();
    }

    Water createWater() {
        return new KaravanWater();
    }
}
