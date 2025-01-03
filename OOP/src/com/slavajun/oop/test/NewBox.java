package com.slavajun.oop.test;

public class NewBox <T>{
    private T[] myList;
    private Object[] myList2;

    public NewBox(int len) {
        this.myList2 = new Object[len];
        this.myList = new T[len];
    }

}
