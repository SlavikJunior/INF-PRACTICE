package com.slavajun.project.animals;

import com.slavajun.project.animal.Animal;

public class Lion extends Animal{
    public Lion(float weight, float height, Colors color) {
        super(weight, height, color);
    }

    public void makeSound() {
        System.out.println("G-R-AA!!");
    }

}
