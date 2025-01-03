package com.slavajun.oop.remember.comp;

public class Ssd {

    private int volume;

    public Ssd(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return Integer.toString(volume);
    }
}
