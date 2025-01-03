package com.slavajun.practice.classwork;

import java.util.Scanner;
import java.util.Random;

public class Task5 {

    public static void main(String[] args) {
        int[][] matrix = createTwoArray();
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < row.length; j++) {
                int temp = row[j];
                System.out.print(temp + " ");
            }
            System.out.println();
        }
        boolean a = isValidArray(matrix);
        System.out.println("а) " + a);
    }

    public static int[][] createTwoArray() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите количество строк!");
        int m = scanner.nextInt();
        System.out.println("Введите количество столбцов!");
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < n; j++) {
                int temp = row[j];
                temp = random.nextInt(0, 1001);
                System.out.print(temp + " ");
            }
            System.out.println();
        }
        return matrix;
    }
    private static boolean isValidArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < row.length; j++) {
                int temp = row[j];
                System.out.print(temp + " ");
            }
        }
                int mult = 1;
                int column = 1;
                for (int i = 0; i < matrix.length; i++) {
                    mult *= matrix[i][column];
                }

                if (Integer.toString(mult).length() == 3) {
                    return true;
                } else {
                    return false;
                }
    }
}


