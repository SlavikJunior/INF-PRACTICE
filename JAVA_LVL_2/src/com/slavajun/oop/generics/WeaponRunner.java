package com.slavajun.oop.generics;

import com.slavajun.oop.game.Unit;
import com.slavajun.oop.game.Warrior;
import com.slavajun.oop.generics.weapon.Sword;
import com.slavajun.oop.generics.weapon.Weapon;

public class WeaponRunner {

    public static void main(String[] args) {

        Warrior<Sword> warrior = new Warrior<>(100, "Orni", 20);
        warrior.setWeapon(new Sword());
        printWeaponDamageNew(warrior);
    }

    public static<T extends Weapon> void printWeaponDamageNew(Unit<T> unit) {
        System.out.println(unit.getDamage());
    }
}
