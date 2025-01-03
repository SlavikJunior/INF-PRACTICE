package com.slavajun.oop.game;

public class BrawlArea {

    public static void main(String[] args) {

        Warrior warrior = new Warrior(100, "Ornstein", 15);
        Opponent opponent = new Opponent(100, "Sceleton", 15);
        brawl(warrior, opponent);

    }

    public static void brawl(Warrior warrior, Opponent opponent) {
        while (opponent.isLeave() && warrior.isLeave()) {
            warrior.attack(opponent);
            opponent.takeDamage(warrior, warrior.getDamage());
            if (opponent.isLeave() && warrior.isLeave()){
                opponent.attack(warrior);
                warrior.takeDamage(opponent, opponent.getDamage());
            }
        }
    }
}
