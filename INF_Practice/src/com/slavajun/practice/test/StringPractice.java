package com.slavajun.practice.test;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringPractice {

    public static void main(String[] args) {
//        searchIdInString();
//    practiceTokenizer();
        stringBuilderPractice();
    }

    private static void practiceTokenizer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите исходную строку!");
        String inputString = scanner.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(inputString, ".,-_\\|/");
        while (tokenizer.hasMoreTokens()) {
            String temp = tokenizer.nextToken();
            System.out.println(temp);
        }

    }

    private static void searchIdInString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите исходную строку!");
        String str = scanner.nextLine();
        System.out.println("Введите символ, индексы которого будем искать!");
        String point = scanner.nextLine();
        int firstId = str.indexOf(point);
        int cnt = 0;
        while (firstId != - 1) {
            String message = String.format("Индекс %d-го ыхождения '%s': %d", (cnt + 1), point, firstId);
            System.out.println(message);
            firstId = str.indexOf(point, firstId+1);
            cnt ++;
        }
    }

    private static void stringBuilderPractice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку, к которой в последующем будем приписывать символы!");
        String inputString = scanner.nextLine();
        StringBuilder string = new StringBuilder(inputString);

        for (int i = 0; i < 10; i++) {
            string.append('*');
            System.out.println(string);
        }

    }
}
