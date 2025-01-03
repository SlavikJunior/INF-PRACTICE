package com.slavajun.project.animals;

import com.slavajun.project.animal.Animal;

public class Cat extends Animal {

    public Cat(float weight, float height, Colors color) {
        super(weight, height, color);
    }
    public void makeSound() {
        System.out.println("M-E-O-W!!");
    }
}
