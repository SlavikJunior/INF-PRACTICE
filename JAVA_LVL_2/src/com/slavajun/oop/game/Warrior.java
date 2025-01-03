package com.slavajun.oop.game;

import com.slavajun.oop.generics.weapon.MeleeWeapon;
import com.slavajun.oop.generics.weapon.Sword;
import com.slavajun.oop.generics.weapon.Weapon;

public class Warrior<T extends Weapon> extends com.slavajun.oop.game.Unit<T> implements com.slavajun.oop.game.Brawl {

    public Warrior(int healthPoints, String name, int damage) {
        super(healthPoints, name, damage);
    }

    @Override
    public void attack(Object opp) {
        if (this.getHealthPoints() > 0) {
            Opponent opponent = (Opponent) opp;
            System.out.println(getName() + " атакует " + opponent.getName());
        }
    }

    @Override
    public boolean isLeave() {
        return getHealthPoints() > 0;
    }

    @Override
    public void takeDamage(Object opp, int damage) {
        Opponent opponent = (Opponent) opp;
        int tempHp = this.getHealthPoints();
        if (isLeave() && tempHp <= damage) {
            setHealthPoints(0);
            System.out.println(getName() + " умерчик:(");
        } else {
            System.out.println(getName() + " получает " + damage + " урона от " + opponent.getName());
            this.setHealthPoints(tempHp - damage);
            System.out.println("У " + getName() + " осталось: " + getHealthPoints() + " очков здоровья");
        }
    }
}
