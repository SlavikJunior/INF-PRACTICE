package com.slavajun.practice.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Task3 {

    public static void main(String[] args) {

//        task1();
//        task2();

        task4();
        task5();
    }

    private static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число!");
        long n = scanner.nextLong();
        String number = Long.toString(n);
        int len = number.length();
        long[] digits = new long[len];
        for (int i = len - 1; i >= 0; i--) {
            digits[len - i - 1] = number.charAt(i) - '0';
        }
        System.out.println("Перевёрнутое число: " + Arrays.toString(digits));
    }

    private static void task4() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите количество строк!");
        int m = scanner.nextInt();
        System.out.println("Введите количество столбцов!");
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        int[] maxs = new int[m];
        for (int i = 0; i < m; i++) {
            int row[] = matrix[i];
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                row[j] = random.nextInt(0, 1001);
                max = Math.max(max, row[j]);
            }
            maxs[i] = max;
            System.out.println(String.format("%d-ая строка: ", (i + 1)) + Arrays.toString(row));
        }
        System.out.println("Максимумы строк: " + Arrays.toString(maxs));
        int sum = 0;
        for (int i = 0; i < maxs.length; i++) {
            sum += maxs[i];
        }
        System.out.println("Сумма этих элементов: " + sum);
    }


    
    private static int[] bubbleSort(int[] ints) {
        int len = ints.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (ints[j] > ints[j + 1]) {
                    ints[j] ^= ints[j+1];
                    ints[j+1] ^= ints[j];
                    ints[j] ^= ints[j+1];
                }
            }
        }
        return ints;
    }

    private static void task2() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minId = Integer.MIN_VALUE;
        int maxId = 0;
        System.out.println("Введите длину массива!");
        int len = scanner.nextInt();
        int[] ints = new int[len];
        for (int i = 0; i < len; i++) {
            ints[i] = random.nextInt(-100, 101);
            if (minId == Integer.MIN_VALUE && ints[i] < 0) {
                minId = i;
            }
            else if (ints[i] > 0) {
                maxId = i;
            }
        }
        System.out.println(Arrays.toString(ints));
        if (minId >= 0 && maxId != 0) {
            ints[minId] ^= ints[maxId];
            ints[maxId] ^= ints[minId];
            ints[minId] ^= ints[maxId];
            System.out.println("Обмен произошёл!");
            /*
            такое применение XORа свапает переменные
             */
        }else {
            System.out.println("Обмен не произошёл!");
        }
        System.out.println(Arrays.toString(ints));
    }

    private static void task1() {
        Scanner scanner = new Scanner(System.in);
        int n = 15;
        int[] ints = new int[n];
        System.out.println("Сейчас будет заполнять массив!");
        for (int i = 0; i < n; i++) {
            System.out.print(String.format("Вводите %d-й элемент! ", (i + 1))+ " ");
            ints[i] = scanner.nextInt();
        }
        System.out.println("Оригинальный массив: " + Arrays.toString(ints));
        int[] newInts1 = Arrays.copyOfRange(ints, 3, 10);
        System.out.println("Первый массив: " + Arrays.toString(newInts1));
        System.out.println("Введите индексы k и m");
        int k = scanner.nextInt();
        int s = scanner.nextInt();
        int[] newInts2 = Arrays.copyOfRange(ints, k, s);
        System.out.println("Второй массив: " + Arrays.toString(newInts2));
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int minId = 0;
        int maxId = 0;
        for (int i = 0; i < n; i++) {
            int temp = ints[i];
            if (temp < min) {
                minId = i;
                min = temp;
            }
            if (temp > max) {
                maxId = i;
                max = temp;
            }
        }
        int[] newInts3 = Arrays.copyOfRange(ints, Math.min(minId, maxId), Math.max(minId, maxId + 1));
        System.out.println("Третий массив: " + Arrays.toString(newInts3));
        printReverseArray(newInts1);
        printReverseArray(newInts2);
        printReverseArray(newInts3);
    }

    private static void printReverseArray(int[] ints) {
        int n = ints.length;
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(ints[i] + " ");
        }
        System.out.println();
    }
}
