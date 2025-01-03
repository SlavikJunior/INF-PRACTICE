package com.slavajun.oop.game;

public class Opponent extends Unit implements Brawl{

    public Opponent(int healthPoints, String name, int damage) {
        super(healthPoints, name, damage);
    }

    @Override
    public boolean isLeave() {
        return getHealthPoints() > 0;
    }

    @Override
    public void takeDamage(Object opp, int damage) {
        Unit opponent = (Unit) opp;
        int tempHp = this.getHealthPoints();
        if (isLeave() && tempHp <= damage) {
            setHealthPoints(0);
            System.out.println(getName() + " умерчик:(");
        }
        else{
            System.out.println(getName() + " получает " + damage + " урона от " + opponent.getName());
            this.setHealthPoints(tempHp - damage);
            System.out.println("У " + getName() + " осталось: " + getHealthPoints() + " очков здоровья");
        }
    }

    @Override
    public void attack(Object opp) {
        if (this.getHealthPoints() > 0) {
            Warrior warrior = (Warrior) opp;
            System.out.println(getName() + " атакует " + warrior.getName());
        }
    }
}
