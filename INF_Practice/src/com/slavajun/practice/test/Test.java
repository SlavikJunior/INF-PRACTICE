package com.slavajun.practice.test;

import java.util.Scanner;
public class Test {

    public static void main(String[] args) {

//        task6();
//        task7();
    }

    private static void task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите три действ. числа через Enter!");
        double d1 = scanner.nextDouble();
        double d2 = scanner.nextDouble();
        double d3 = scanner.nextDouble();
        double[] doubles = {d1, d2, d3};
        System.out.println("Числа прошедшие проверку: ");
        for (double temp : doubles) {
            System.out.print(temp > 1 && temp < 3 ? temp + " " : "None ");
        }
    }

    private static void task7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число!");
        int k = scanner.nextInt();
        for (int i = 1; i <= k ; i++) {
            System.out.println(i * k);
        }
    }

    private static void task8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите 4 действительных числа!");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

    }
}
