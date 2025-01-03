package com.slavajun.oop.generics;

public class List<T> {

    private T[] objects;
    private int size;

    public List(int startSize) {
        this.objects = (T[]) new Object[startSize];
    }

    public List() {
        this.objects = (T[]) new Object[10];
    }

    public void add(T element) {
        objects[size] = element;
        size ++;
    }

    public T get(int index) {
        return objects[index];
    }

    public int getSize() {
        return size;
    }
}
