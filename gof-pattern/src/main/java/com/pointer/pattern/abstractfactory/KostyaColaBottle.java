package com.pointer.pattern.abstractfactory;

public class KostyaColaBottle extends Bottle {

    private String material;
    private int vol = 1;

    @Override
    int fill(Water water) {
        return vol;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }

}
