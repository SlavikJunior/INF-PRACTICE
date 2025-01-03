package com.slavajun.practice.test;

public class Box {

    private int size;
    private String color;

    public Box(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return size + " " + color;
    }
}
