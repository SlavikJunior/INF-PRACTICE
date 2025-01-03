package com.slavajun.practice.classwork;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();
//        task11();
//        task12();
//        task13();
        task14();
    }

    public static void task14() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите количество строк матрицы!");
        int n = scanner.nextInt();
        System.out.println("Введите количество столбцов матрицы!");
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < m; j++) {
                row[j] = random.nextInt(0, 10);
            }
            System.out.println(Arrays.toString(row));
        }
        String notNullElements = "";
        String nullElements = "";
        for (int i = 0; i < n; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < m; j++) {
                if (row[j] != 0) {
                    notNullElements += "(i:" + i + " " + "j:" + j + ") ";
                }
                else if (row[j] == 0) {
                    nullElements += "(i:" + i  + " " + "j:" + j + ") ";
                }
            }
        }
        System.out.println("Ненулевые элементы (индексы): " + notNullElements);
        System.out.println("Нулевые элементы (индексы): " + nullElements);
    }

    public static void task13() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк матрицы!");
        int n = scanner.nextInt();
        System.out.println("Введите количество столбцов матрицы!");
        int m = scanner.nextInt();
        double max = -1000000000;
        double min = 1000000000;
        double[][] matrix = new double[n][m];
        for (int i = 0; i < n; i++) {
            double[] row = matrix[i];
            for (int j = 0; j < m; j++) {
                System.out.print(String.format("Вводите %d-й элемент %d-й строки: ", j, i));
                row[j] = scanner.nextDouble();
                max = Math.max(max, row[j]);
                min = Math.min(min, row[j]);
            }
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Максимальный: " + max +"\n" +
                            "Минимальный: " + min + "\n" +
                            "Их среднее арифметическое: " + (max + min) / 2);
    }

    public static void task12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк матрицы!");
        int n = scanner.nextInt();
        System.out.println("Введите количество столбцов матрицы!");
        int m = scanner.nextInt();
        double max = -1000000000;
        double[][] matrix = new double[n][m];
        for (int i = 0; i < n; i++) {
            double[] row = matrix[i];
            for (int j = 0; j < m; j++) {
                System.out.print(String.format("Вводите %d-й элемент %d-й строки: ", j, i));
                row[j] = scanner.nextDouble();
                max = Math.max(max, row[j]);
            }
            System.out.println(Arrays.toString(row));
        }
        for (int i = 0; i < n; i++) {
            double[] row = matrix[i];
            for (int j = 0; j < m; j++) {
                row[j] = row[j] / max;
            }
            System.out.println(Arrays.toString(row));
        }
    }

    public static void task11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк!");
        int n = scanner.nextInt();
        int m = 9;
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < m; j++) {
                System.out.print(String.format("Вводите %d-й элемент %d-й строки", j, i) + " ");
                row[j] = scanner.nextInt();
            }
            System.out.println(Arrays.toString(row));
        }
        System.out.println("\nСреднее арифметическое каждого столбца:");
        for (int j = 0; j < m; j++) {
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += matrix[i][j];
            }
            double average = sum / n;
            System.out.printf("Столбец %d: %.2f%n", j + 1, average);
        }

        System.out.println("\nСреднее арифметическое столбцов с четными номерами:");
        for (int j = 0; j < m; j++) {
            if (j % 2 == 0) {
                double sum = 0;
                for (int i = 0; i < n; i++) {
                    sum += matrix[i][j];
                }
                double average = sum / n;
                System.out.printf("Столбец %d: %.2f%n", j + 1, average);
            }
        }
    }

    public static void task10() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите длину массива!");
        int len = scanner.nextInt();
        int[] ints = new int[len];
        for(int i = 0; i < len; i++) {
            ints[i] = random.nextInt(1, 1001);
        }
        System.out.println(Arrays.toString(ints));
        System.out.println("Меняю местами 2 и 5");
        ints[2] ^= ints[5];
        ints[5] ^= ints[2];
        ints[2] ^= ints[5];
        System.out.println(Arrays.toString(ints));
        System.out.println("Введите индексы элменетов, которые хотите поменять местами!");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(String.format("Меняю местами %d-й и %d-й", m, n));
        ints[m] ^= ints[n];
        ints[n] ^= ints[m];
        ints[m] ^= ints[n];
        System.out.println(Arrays.toString(ints));
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int idMax = 0;
        int idMin = 0;
        for (int i = 0; i < len; i++) {
            if (ints[i] > max) {
                idMax = i;
                max = ints[i];
            }
            if (ints[i] <= min) {
                idMin = i;
                min = ints[i];
            }
        }
        System.out.println("Меняю местами 3 и максимальный");
        ints[3] ^= ints[idMax];
        ints[idMax] ^= ints[3];
        ints[3] ^= ints[idMax];
        System.out.println(Arrays.toString(ints));
        System.out.println("Меняю местами 1 и минимальный");
        ints[1] ^= ints[idMin];
        ints[idMin] ^= ints[1];
        ints[1] ^= ints[idMin];
        System.out.println(Arrays.toString(ints));
    }

    public static void task9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива!");
        int len = scanner.nextInt();
        int[] ints = new int[len];
        for (int i = 0; i < len; i ++) {
            System.out.print("Вводите " + (i+1) + " элемент!");
            ints[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < len - 1; i ++) {
            if (ints[i] > ints[i+1]) {
                ints[i] ^= ints[i+1];
                ints[i+1] ^= ints[i];
                ints[i] ^= ints[i+1];
            }
        }
        System.out.println("Получившийся массив: " + Arrays.toString(ints));
        System.out.println("Последним элементом всегда будет наибольший элемент массива: " + ints[len-1]);
    }

    private static void task8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива!");
        int len = scanner.nextInt();
        int[] ints = new int[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            ints[i] = random.nextInt(0, 101);
        }
        System.out.println("Получившийся массив: " + Arrays.toString(ints));

        int max = Integer.MIN_VALUE;
        int preMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int preMin = Integer.MAX_VALUE;

        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < len; i++) {
            if (ints[i] > max) {
                preMax = max;
                max = ints[i];
            }
            else if (ints[i] > preMax) {
                preMax = ints[i];
            }
            if (ints[i] < min) {
                preMin = min;
                min = ints[i];
                num1 = i + 1;
            } else if (ints[i] < preMin) {
                preMin = ints[i];
                num2 = i + 1;
            }
        }
        System.out.println("Максимальный: " + max);
        System.out.println("ПредМаксимальный: " + preMax);
        System.out.println("Минимальный: " + min);
        System.out.println("ПредМинимальный: " + preMin);
        System.out.println("Номер минимального: " + num1 + " Номер предминимального: " + num2 + " (индексация с единицы!)");
    }

    private static void task7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива!");
        int[] ints = new int[scanner.nextInt()];
        System.out.println("Введите первую пару крайних чисел!");
        int k1 = scanner.nextInt();
        int k2 = scanner.nextInt();
        System.out.println("Введите вторую пару крайних чисел!");
        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        long sum = 0;
        long mult = 1;
        long sumKv = 0;
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(0, 1001);
            sum += ints[i];
            mult *= ints[i];
            sumKv += (long)ints[i] * ints[i];
        }
        double srAr = (double)sum / ints.length;
        int sumIntsBetwenK = 0;
        int sumIntsBetwenS = 0;
        int sum6 = 0;
        int[] ints6 = Arrays.copyOf(ints, 6);
        int[] intsBetwenK = Arrays.copyOfRange(ints, k1, k2);
        int[] intsBetwenS = Arrays.copyOfRange(ints, s1, s2);
        for (int i = 0; i < ints6.length; i++) {
            sum6 += ints6[i];
        }
        for (int i = 0; i < intsBetwenK.length; i++) {
            sumIntsBetwenK += intsBetwenK[i];
        }
        for (int i = 0; i < intsBetwenS.length; i++) {
            sumIntsBetwenS += intsBetwenS[i];
        }
        double srArBetwenS = (double)sum / ints.length;
        System.out.println("Получившийся массив: " + Arrays.toString(ints));
        System.out.println("Первые 6 элементов: " + Arrays.toString(ints6));
        System.out.println("Получившийся массив между первыми двумя крайними значениями: " + Arrays.toString(intsBetwenK));
        System.out.println("Получившийся массив между вторыми двумя крайними значениями: " + Arrays.toString(intsBetwenS));
        System.out.println("Сумма всех элементов: " + sum);
        System.out.println("Произведение всех элементов: " + mult);
        System.out.println("Сумма квадратов всех элементов: " + sumKv);
        System.out.println("Сумма первых шести элементов: " + sum6);
        System.out.println("Среднее арифметичкое всех элементов массива: " + srAr);
        System.out.println("Сумма элементов между первыми двумя крайними значениями: " + sumIntsBetwenK);
        System.out.println("Среднее арифметическое элементов между вторыми двумя крайними значениями: " + srArBetwenS);

    }

    private static void task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите режим работы!\n" +
                            "1: арифметическая прогрессия\n" +
                            "2: последовательность Фибоначи");
        byte mode = scanner.nextByte();
        switch (mode) {
            case 1:
                System.out.println("Введите длину последовательности!");
                int len = scanner.nextInt();
                int[] ints = new int[len];
                System.out.println("Введите первый член последовательности!");
                int a1 = scanner.nextInt();
                System.out.println("Введите разность прогрессии!");
                int d = scanner.nextInt();
                ints[0] = a1;
                for (int i = 1; i < len; i++) {
                    ints[i] = a1 + i * d;
                }
                System.out.println(Arrays.toString(ints));
                break;
            case 2:
                createFibo();
                break;
            default:
                System.out.println("Такого режима нет:/");
        }
    }

    private static void createFibo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину последовательности!");
        int len = scanner.nextInt();
        long[] longs = new long[len];
        longs[0] = 0;
        longs[1] = 1;
        long temp = 1;
        for (int i = 2; i < len; i++) {
            longs[i] = temp;
            temp += longs[i];
            temp -= longs[i-2];
        }
        System.out.println(Arrays.toString(longs));
    }

    private static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите k-число!");
        int k = scanner.nextInt();
        int[] ints = getInts();
        int num = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > k) {
                num = i + 1;
                break;
            }
        }
        System.out.println("Номер первого элемента большего k: " + num);
    }

    private  static void task4() {
        int[] newInts = getInts();
        System.out.println("Получившийся массив: " + Arrays.toString(newInts));
        int sum = 0;
        for (int j = 0; j < newInts.length; j++) {
            if (newInts[j] % 2 == 0) {
                sum += newInts[j];
            }
        }
        System.out.println("Сумма чётных элементов: " + sum);
    }

    private static int[] getInts() {
        Scanner scanner = new Scanner(System.in);
        int[] ints = new int[100];
        System.out.println("Вводите элементы последовательности!\n" +
                            "Введите 0 для прекращения!");
        boolean flag = true;
        int i = 0;
        while (flag) {
            ints[i] = scanner.nextInt();
            if (ints[i] == 0) {
                flag = false;
            }
            i ++;
        }
        int[] newInts = searchStop(ints);
        return newInts;
    }

    private static int[] searchStop(int[] ints) {
        int cnt = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == 0) {
                cnt = i;
                break;
            }
        }
        int[] retInts = new int[cnt+1];
        for (int i = 0; i < cnt+1; i++) {
            retInts[i] = ints[i];
        }
        return retInts;
    }

    private static void task3() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        int n = 0;
        while (!flag) {
            System.out.println("Введите длину последовательности! Длина не меньше 3!");
            n = scanner.nextInt();
            if (n >= 3) {
                flag = true;
            }
        }
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = new Random().nextInt(0, 1001);
        }
        System.out.println(Arrays.toString(ints));
        int maxSum = -1000000000;
        int minSum = 1000000000;
        int idMax = 0;
        int idMin = 0;
        for (int i = 1; i < n; i++) {
            if ((ints[i] + ints[i-1]) > maxSum){
                maxSum = ints[i] + ints[i-1];
                idMax = i;
            }
            if ((ints[i] + ints[i-1]) <= minSum){
                minSum = ints[i] + ints[i-1];
                idMin = i;
            }
        }
        System.out.println("Максимальная сумма соседних чисел: " + maxSum + " индексы этих чисел: " + (idMax - 1) + " " + idMax);
        System.out.println("Минимальная сумма соседних чисел: " + minSum + " индексы этих чисел: " + (idMin - 1) + " " + idMin);
    }

    private static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество пар чисел!");
        int n = scanner.nextInt();
        int[][] ints = new int[n][2];
        int maxSum = -1000000000;
        int minMult = 1000000000;
        for (int i = 0; i < n; i++) {
            int[] row = ints[i];
            for (int j = 0; j < row.length; j++) {
                System.out.print(String.format("Введите %d-й элемент %d-й строки!", (j+1), (i+1)) + " ");
                row[j] = scanner.nextInt();
            }
            minMult = Math.min(minMult, (row[0] * row[1]));
            maxSum = Math.max(maxSum, (row[0] + row[1]));
            System.out.println();
        }
        System.out.println("Максимальная сумма: " + maxSum);
        System.out.println("Минимальное произведение: " + minMult);
    }

    private static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину последовательности!");
        int n = scanner.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(String.format("Вводите %d-й элемент!", (i+1)));
            ints[i] = scanner.nextInt();
        }
        int min = 1000000000;
        int max = -1000000000;
        int idMin = 0;
        int idMax = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] <= min) {
                min = ints[i];
                idMin = i;
            }
            if (ints[i] >= max) {
                max = ints[i];
                idMax = i;
            }
        }
        System.out.println("Ответ: а) " + idMax);
        System.out.println("       б) " + idMin);
    }
}
