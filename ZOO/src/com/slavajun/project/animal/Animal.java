package com.slavajun.project.animal;

import com.slavajun.project.animals.Colors;

public class Animal {

    protected float weight;
    protected float height;
    protected Colors color;

    public Animal(float weight, float height, Colors color) {
        this.weight = weight;
        this.height = height;
        this.color = color;
    }
    public float getWeight() {
        return weight;
    }
    public float getHeight() {
        return height;
    }
    public Colors getColor() {
        return color;
    }
    public void setColor() {
        this.color = color;
    }
    protected void makeSound() {
        System.out.println("...");
    }
    public void move() {
    }
    public void eat(float food) {
        weight += food;
    }
}
