package com.slavajun.practice.test;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Box> boxes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boxes.add(new Box(12, "Brown"));
        Box red = new Box(52, "Red");
        boxes.add(red);
        System.out.println(boxes);
        boxes.remove(0);
        System.out.println(boxes + " " + boxes.size());
        boxes.remove(red);
        System.out.println(boxes + " " + boxes.size());
    }
}
