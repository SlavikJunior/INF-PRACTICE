package com.slavajun.practice.classwork;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

//        task1();
//        task3();
//        task8();
//        task9();
//        task10();
//        task11();
//        task12();
//        task14();


    }

    static void task14() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите исходную строку!");
        String inputString = scanner.nextLine();
        String string = reversString(inputString);
        System.out.println(string);
        String firstHalf = "";
        String secondHalf = "";
        for (int i = 0; i < inputString.length() / 2; i++) {
            firstHalf += inputString.charAt(i);
        }
        for (int i = inputString.length() / 2; i < inputString.length(); i++) {
            secondHalf += inputString.charAt(i);
        }
        System.out.println(secondHalf + firstHalf);
    }

    static void task12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите исходную строку!");
        String inputLine = scanner.nextLine();
        System.out.println("Введите первую пару индексов!");
        int firstStartId = scanner.nextInt();
        int firstEndId = scanner.nextInt();
        System.out.println("Введите вторую пару индексов!");
        int secondStartId = scanner.nextInt();
        int secondEndId = scanner.nextInt();
        String firstRow = inputLine.substring(firstStartId, firstEndId + 1);
        String secondRow = inputLine.substring(secondStartId, secondEndId + 1);
        System.out.println("Вторая подстрока: " + firstRow);
        System.out.println("Первая подстрока: " + secondRow);
    }

    public static String reversString(String inputString) {
        String firstHalf = inputString.substring(0, inputString.length() / 2);
        String secondHalf = inputString.substring(inputString.length() / 2, inputString.length());
        return secondHalf + firstHalf;
    }

    static void task11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите свою строку!");
        String inputString = scanner.nextLine();
        String digits = "";
        for (int i = 0; i < inputString.length(); i++) {
            char curEl = inputString.charAt(i);
            if (!Character.isLetter(curEl)) {
                digits += curEl;
            }
        }
        System.out.println("Цифры вашей строки: " + digits);
    }

    static void task10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите строку!");
        String inputString = scanner.nextLine();
        String string = inputString.replaceAll("[A-Z]|[a-z]", "");
        // String result = inputString.replaceAll("//D", ""q);
        System.out.println(string);

        int sumDigits = 0;
        char maxChar = ' ';
        for (int i = 0; i < string.length(); i++) {
            sumDigits += string.charAt(i) - '0';
            maxChar = (char) Math.max(maxChar, string.charAt(i));
        }
        System.out.println("Сумма цифр: " + sumDigits);
        System.out.println("Максимальная цифра: " + maxChar);
    }

    static void task9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите строку!");
        String inputString = scanner.nextLine();
        System.out.println(inputString.substring(0, inputString.length() / 2));
    }

    static void task8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите строку!");
        String inputString = scanner.nextLine();
        char firstLetter = inputString.charAt(2);
        char secondLetter = inputString.charAt(4);

        System.out.println(firstLetter + "" + secondLetter);
    }

    static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку!");
        String inputString = scanner.nextLine();
        int len = inputString.length();
        System.out.println("Длина строки:" + (len % 2 == 0 ? " чётная" : " нечётная"));
    }

    static void task3() {
        Scanner scanner = new Scanner(System.in);
        String[] city = new String[3];
        for (int i = 0; i < city.length; i++) {
            System.out.print("Вводите " + (i + 1) + "-ую строку: ");
            city[i] = scanner.nextLine();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < city.length; i++) {
            max = Math.max(max, city[i].length());
            min = Math.min(min, city[i].length());
        }
        System.out.println("Самая короткая длина: " + min);
        System.out.println("Самая длинная длина: " + max);
    }
}
