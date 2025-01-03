package com.slavajun.oop.game;

public interface Brawl {

    void attack(Object opp);
    void takeDamage(Object opp, int damage);
    boolean isLeave();
}
