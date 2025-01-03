package com.slavajun.oop.test;

public class Box <T> {

    private T myElement;

    public void setMyElement(T element) {
        this.myElement = element;
    }

    public T getMyElement() {
        return this.myElement;
    }
}
