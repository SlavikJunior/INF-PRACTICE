package com.slavajun.oop.game;

import com.slavajun.oop.generics.weapon.Weapon;

public abstract class Unit<T> {

    private int healthPoints;
    private String name;
    private int damage;
    private T weapon;

    public Unit(int healthPoints, String name, int damage) {
        this.healthPoints = healthPoints;
        this.name = name;
        this.damage = damage;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        String s = "";
        return  s = String.join(" ", name + healthPoints + weapon + damage);
    }
}
