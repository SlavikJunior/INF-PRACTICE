package com.slavajun.oop.remember.comp;

import com.slavajun.oop.remember.Devicable;

public class Laptop extends Computer implements Computerable, Devicable {

    private int weight;

    public Laptop(String processor, Ram ram, Ssd ssd, int weight) {
        super(processor, ram, ssd);
        this.weight = weight;
    }

    @Override
    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public void keyboard() {

    }

    @Override
    public void mouse() {

    }

    @Override
    public String toString() {
        return processor +" " + ram + " " + ssd + " " + weight;
    }

}
