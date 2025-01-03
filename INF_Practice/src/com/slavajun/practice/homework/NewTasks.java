package com.slavajun.practice.homework;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class NewTasks {
    public static void main(String[] args) {
//        task381();
//        task382();
//        task383();
        task384();
//        task385();
//        task388();
//        task389();
    }

    private static void task389() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк!");
        int m = scanner.nextInt();
        System.out.println("Введите количество столбцов!");
        int n = scanner.nextInt();
        double[][] matrix = new double[m][n];
        for (int i = 0; i < m; i++) {
            double[] row = matrix[i];
            for (int j = 0; j < n; j++) {
                System.out.print("Вводите элемент! ");
                row[j] = scanner.nextDouble();
            }
            System.out.println(Arrays.toString(row));
        }
        double[] idMinOfLines = new double[n];
        for (int i = 0; i < m; i++) {
            double[] row = matrix[i];
            double localMin = Double.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (row[j] < localMin) {
                    localMin = row[j];
                    idMinOfLines[i] = j;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(String.format("Минимум строки %d находится в колонке: %d", i, (int)(idMinOfLines[i])));
        }
    }

    private static void task388() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите порядок матрицы!");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < n; j++) {
                row[j] = random.nextInt(0, 1001);
                System.out.print(row[j] + " ");
            }
            System.out.println();
        }
        int[] idMaxOfLines = new int[n];
        for (int i = 0; i < n; i++) {
            int[] row = matrix[i];
            int localMax = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                if (row[j] > localMax) {
                    localMax = row[j];
                    idMaxOfLines[i] = j;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(String.format("Максимум строки %d находится в колонке: %d", i, idMaxOfLines[i]));
        }
    }

    private static void task385() {
        int[][] matrix = genTwoArray();
//        int globalMax = moveWithTwoArray(matrix, "gmax");
//        int globalMin = moveWithTwoArray(matrix, "gmin");
////        int idgmax = moveWithTwoArray(matrix, "idgmax");
////        int idgmin = moveWithTwoArray(matrix, "idgmin");
////        System.out.println(idgmax + " " + idgmin);
//        System.out.println(globalMax);
//        System.out.println(globalMin);
        int[][] matrixOfMins = new int[matrix.length][2];
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            int localMin = Integer.MAX_VALUE;
            for (int j = 0; j < row.length; j++) {
                if (row[j] < localMin) {
                    localMin = row[j];
                    matrixOfMins[i][0] = i;
                    matrixOfMins[i][1] = row[j];
                }
            }
            System.out.print("Строка: " + matrixOfMins[i][0] + " ");
            System.out.println("Её локальный минимум: " + matrixOfMins[i][1]);
        }
        int numberOfLine = -1;
        int globalMin = Integer.MAX_VALUE;
        for (int i = 0; i < matrixOfMins.length; i++) {
            int[] row = matrixOfMins[i];
            if (row[row.length - 1] < globalMin) {
                globalMin = row[row.length - 1];
                numberOfLine = i;
            }
        }
        System.out.println("Минимальный элемент таблицы: " + globalMin);
        System.out.println("Номер строки с минимальным элементом: " + numberOfLine);
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[numberOfLine][i];
        }
        System.out.println("Сумма элементов строки, содержащей минимальный элемент табоицы: \n" +
                "" + sum);
    }

    private static void task384() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите количество строк!");
        int m = scanner.nextInt();
        System.out.println("Введите количество столбцов!");
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        int[] maxs = new int[m];
        System.out.println("\nПолучили массив:");
        for (int i = 0; i < m; i++) {
            int[] row = matrix[i];
            int localMax = 0;
            for (int j = 0; j < n; j++) {
                row[j] = random.nextInt(0, 1001);
                localMax = Math.max(localMax, row[j]);
                System.out.print(row[j] + " ");
            }
            maxs[i] = localMax;
            System.out.println();
        }
        System.out.println("\nМаксимуы:");
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += maxs[i];
            System.out.print(maxs[i] + " ");
        }
        System.out.println("\n\nИх сумма: " + sum);
    }

    private static void task383() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите количество столбцов!");
        int m = 18;
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        int[] maxs = new int[m];
        for (int i = 0; i < m; i++) {
            int maxInLine = Integer.MIN_VALUE;
            int[] row = matrix[i];
            for (int j = 0; j < n; j++) {
                row[j] = random.nextInt(-1000, 1001);
                maxInLine = Math.max(maxInLine, Math.abs(row[j]));
            }
            maxs[i] = maxInLine;
            System.out.println(String.format("Строка %d-ая: ", (i + 1)) + Arrays.toString(row));
        }
        int globalMax = 0, idGlobalMax = 0;
        for (int i = 0; i < maxs.length; i++) {
            if (maxs[i] > globalMax) {
                globalMax = maxs[i];
                idGlobalMax = i;
            }
        }
        System.out.println("Наибольший элемент: " + globalMax);
        System.out.println("Строка: " + (idGlobalMax + 1));
    }

    private static void task382() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите количество строк!");
        int m = scanner.nextInt();
        System.out.println("Введите количество столбцов!");
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        int[] mins = new int[m];
        int[] maxs = new int[m];
        for (int i = 0; i < m; i ++) {
            int minInLine = Integer.MAX_VALUE, maxInLine = Integer.MIN_VALUE;
            int[] row = matrix[i];
            for (int j = 0; j < n; j++) {
                row[j] = random.nextInt(0, 1001);
                minInLine = Math.min(minInLine, row[j]);
                maxInLine = Math.max(maxInLine, row[j]);
            }
            mins[i] = minInLine;
            maxs[i] = maxInLine;
            System.out.println("Строка: " + Arrays.toString(row));
            System.out.println("Минимумы" + Arrays.toString(mins));
            System.out.println("Максимумы: " + Arrays.toString(maxs));
        }
        int globalMin = Integer.MAX_VALUE;
        int globalMax = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            globalMax = Math.max(globalMax, maxs[i]);
            globalMin = Math.min(globalMin, mins[i]);
        }
        double result = (double)(globalMin + globalMax) / 2;
        System.out.println("Среднее арифметическое минимальнейшего и максимальнейшего: " + result);
    }

    private static void task381() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите количество строк!");
        int m = scanner.nextInt();
        System.out.println("Введите количество столбцов!");
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i ++) {
            int[] row = matrix[i];
            for (int j = 0; j < n; j++) {
                row[j] = random.nextInt(0, 1001);
            }
            System.out.println(Arrays.toString(row));
        }
        System.out.println("===============================================================");
        for (int i = 0; i < m; i++) {
            int localMax = 0, idLocalMax = 0;
            int[] row = matrix[i];
            for (int j = 0; j < n; j++) {
                if (row[j] > localMax) {
                    localMax = row[j];
                    idLocalMax = j;
                }
            }
            row[idLocalMax] = 0;
            System.out.println(Arrays.toString(row));
        }
    }

    private static int[][] genTwoArray() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите порядок матрицы!!");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < n; j++) {
                row[j] = random.nextInt(0, 1001);
                System.out.print(row[j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    private static int moveWithTwoArray(int[][] matrix, String inputLine) {
        int[] maxs = new int[matrix.length];
        int[] mins = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int localMax = Integer.MIN_VALUE;
            int localMin = Integer.MAX_VALUE;
            int[] row = matrix[i];
            for (int j = 0; j < row.length; j++) {
                localMin = Math.min(localMin, row[j]);
                localMax = Math.max(localMax, row[j]);
            }
            maxs[i] = localMax;
            mins[i] = localMin;
        }
        int globalMax = Integer.MIN_VALUE;
        int globalMin = Integer.MAX_VALUE;
//        int idGlobalMax = 0;
//        int idGlobalMin = 0;
        for (int i = 0; i < maxs.length; i++) {
            globalMax = Math.max(globalMax, maxs[i]);
            globalMin = Math.min(globalMin, mins[i]);
//            if (maxs[i] > globalMax) {
//                globalMax = maxs[i];
//                idGlobalMax = i;
//            }
//            if (mins[i] < globalMin) {
//                globalMin = mins[i];
//                idGlobalMin = i;
//            }
        }
        switch (inputLine) {
            case "gmax":
                return globalMax;
            case "gmin":
                return globalMin;
                case "mins":
                for (int i = 0; i < mins.length; i++) {
                    return mins[i];
                }
                break;
            case "maxs":
                for (int i = 0; i < maxs.length; i++) {
                    return maxs[i];
                }
                break;
//            case "idgmax":
//                return idGlobalMax;
//            case "idgmin":
//                return idGlobalMin;
            default:
                return 0;
        }
        return 0;
    }
}