package com.slavajun.project.main;

import com.slavajun.project.animal.Animal;
import com.slavajun.project.animals.Cat;
import com.slavajun.project.animals.Colors;
import com.slavajun.project.animals.Lion;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Animal>animals = new ArrayList();
        for (int i = 0; i < 5; i++) {
            animals.add(new Lion(120, 52, Colors.Orange));
            animals.add(new Cat(5.2f, 0.52f, Colors.Black));
        }

        for (Animal a : animals) {
            a.eat(10);
        }
        for (Animal a : animals) {
            System.out.println(a.getWeight());
        }
    }
}
