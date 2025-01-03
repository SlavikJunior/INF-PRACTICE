package com.slavajun.oop.remember;

import com.slavajun.oop.remember.comp.Computer;
import com.slavajun.oop.remember.comp.Laptop;
import com.slavajun.oop.remember.comp.Ram;
import com.slavajun.oop.remember.comp.Ssd;

public class Main {

    public static void main(String[] args) {

        Devicable computer = new Computer("core i5", new Ram(24), new Ssd(512));
        Devicable laptop = new Laptop("core i7", new Ram(12), new Ssd(128), 3);
        print(computer, laptop);
    }

    static void print(Devicable... devicables) {
        for (Devicable devicable : devicables) {
            devicable.printInfo();
        }
    }
}
