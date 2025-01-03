package com.slavajun.oop.remember.comp;

public class Ram {

    private int volume;

    public Ram(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return Integer.toString(volume);
    }
}
