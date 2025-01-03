package com.slavajun.practice.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;

public class ArrayLists {

    public static void main(String[] args) {

        LinkedList<Person> listic = new LinkedList<>();
        Person Sasha = new Person("Sasha", "female", 17);
        Person Tonya = new Person("Tonya", "female", 16);
        Person Slava = new Person("Slava", "male", 19);

        listic.add(Sasha);
        listic.add(Slava);
        listic.add(Tonya);

        for (Person personIter : listic) {
            System.out.println((personIter));
        }

        Person firstPerson = listic.getFirst();
        Person lastPerson = listic.getLast();
        System.out.println("\n" + firstPerson);
        System.out.println(lastPerson);
    }
}
