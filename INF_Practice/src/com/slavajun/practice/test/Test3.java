package com.slavajun.practice.test;

import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = inputInt();
        System.out.println(n);
    }

    private static int inputInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
