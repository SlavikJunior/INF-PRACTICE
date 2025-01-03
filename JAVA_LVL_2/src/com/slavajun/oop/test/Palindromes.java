package com.slavajun.oop.test;

import java.util.Scanner;

public class Palindromes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string you want to check on the palindrome");
        String targetString = scanner.nextLine();
        findPalindromes(targetString);


        
    }

    public static void findPalindromes(String string) {

        int len = string.length();
        switch (len % 2) {
            case 0 -> {
                boolean flag0;
                boolean[] flags0 = new boolean[string.length() / 2];
                for (int i = 0; i < string.length() / 2; i++) {
                    flag0 = string.charAt(i) == string.charAt(len - 1 - i);
                    flags0[i] = flag0;
                }
                int cnt0 = 0;
                for (boolean curFlag : flags0) {
                    if (curFlag)
                        cnt0++;
                }
                if (cnt0 == string.length() / 2)
                    System.out.println("Поздравляю! нашли палиндром");
                else
                    System.out.println("Строка - не палиндром :/");
            }
            case 1 -> {
                boolean flag1;
                boolean[] flags1 = new boolean[string.length() / 2 + 1];
                for (int i = 0; i < string.length() / 2 + 1; i++) {
                    flag1 = string.charAt(i) == string.charAt(len - 1 - i);
                    flags1[i] = flag1;
                }
                int cnt1 = 0;
                for (boolean curFlag : flags1) {
                    if (curFlag)
                        cnt1++;
                }
                if (cnt1 == string.length() / 2 + 1)
                    System.out.println("Поздравляю! нашли палиндром");
                else
                    System.out.println("Строка - не палиндром :/");
            }
        }

    }
}
