package com.slavajun.practice.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число!");
        int n = scanner.nextInt();
        String number = Integer.toString(n);
        char[] chars = new char[number.length()];
        for (int i = number.length() - 1; i >= 0 ; i--) {
            chars[number.length() - i - 1] = number.charAt(i);
        }
        System.out.println(Arrays.toString(chars));
    }
}
