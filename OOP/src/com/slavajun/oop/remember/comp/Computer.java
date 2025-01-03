package com.slavajun.oop.remember.comp;

import com.slavajun.oop.remember.Devicable;

public class Computer implements Devicable, Computerable{

    String processor;
    Ram ram;
    Ssd ssd;

    public Computer(String processor, Ram ram, Ssd ssd) {
        this.processor = processor;
        this.ram = ram;
        this.ssd = ssd;
    }

    @Override
    public void powerOn() {

    }

    @Override
    public void powerOf() {

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
        return processor +" " + ram + " " + ssd;
    }
}
