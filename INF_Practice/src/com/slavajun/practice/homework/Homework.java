package com.slavajun.practice.homework;
import java.util.Arrays;
import java.util.Scanner;
public class Homework {

    public static void main(String[] args) {

//        task1();

//        task2();

//        task3();

//        task4();

//        task5();

//        task6();

//        task7();

//        task8();

//        task9();

//        task10();
    }

    private static void task10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш возраст!");
        int n = scanner.nextInt();

        int lastDigit = n % 10;
        if (lastDigit == 0 || lastDigit > 4 && lastDigit <= 9) {
            System.out.println("Ваш возраст: " + n + " лет");
        }
        else if (lastDigit == 1) {
            System.out.println("Ваш возраст: " + n + " год");
        } else if (lastDigit >= 2 && lastDigit <= 4) {
            System.out.println("Ваш возраст: " + n + " года");
        }
    }

    private static void task9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите действительное число!");
        double x = scanner.nextDouble();
        System.out.println("Выбирите действие: \n" +
                            "1\n" +
                            "2");
        int move = scanner.nextInt();
        switch (move) {
            case 1:
                double res1;
                if (x <= 0) {
                    res1 = 0;
                }
                else if (x > 0 && x <= 1) {
                    res1 = x;
                } else {
                    res1 = Math.pow(x, 4);
                }
                System.out.println("Результат: " + res1);
                break;
            case 2:
                double res2;
                if (x <= 0) {
                    res2 = 0;
                }
                else if (x > 0 && x <= 1) {
                    res2 = x * x - x;
                } else {
                    res2 = x * x - Math.toDegrees(Math.sin(Math.PI * x * x));
                }
                System.out.println("Результат: " + res2);
                break;
            default:
                System.out.println("Такого действия нет:/");
        }

    }

    private static void task8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int n = scanner.nextInt();
        int[] ints = new int[n];
        ints[0] = 1;
        for (int i = 1; i < ints.length; i++) {
            if (i % 2 == 0) {
                ints[i] = (ints[i-1] - 2) * -1;
            } else {
                ints[i] = (ints[i-1] + 2) * -1;
            }
        }
        System.out.println("Получен массив: \n" +
                        "" + Arrays.toString(ints));
    }

    private static void task7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число!");
        int n = scanner.nextInt();
        String number = Integer.toString(n);
        int sumDigits = 0;
        int cntDigits = number.length();
        char firstDigit = ' ';
        char beforeLastDigit = ' ';
        for (int i = 0; i < cntDigits; i++) {
            if (i == 0) {
                firstDigit = number.charAt(i);
            }
            else if (cntDigits > 1 && i == cntDigits - 2) {
                beforeLastDigit = number.charAt(i);
            }
            sumDigits += number.charAt(i) - '0';
        }
        System.out.println("Количество цифр в числе: " + cntDigits);
        System.out.println("Сумма цифр числа: " + sumDigits);
        System.out.println("Первая цифра: " + firstDigit);
        System.out.println("Предпоследняя цифра: " + beforeLastDigit);


    }

    private static void task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите действительное число!");
        while(!scanner.hasNextDouble()) {
            System.out.println("Прошу ввести действительное число!");
            scanner.next();
        }
        double a = scanner.nextDouble();
        System.out.println("Введите натуральное число!");
        while (!scanner.hasNextInt()) {
            System.out.println("Прошу ввести натуральное число!");
            scanner.next();
        }
        int n = scanner.nextInt();

        System.out.println("Выберите режим!\n" +
                            "1:\n" +
                            "2:");
        while(!scanner.hasNextInt()) {
            System.out.println("Ошибка! 1 или 2");
            scanner.next();
        }
        System.out.println("Выбирете опцию");
        int mode = scanner.nextInt();
        switch (mode) {
            case 1:
                double result1 = 0;
                for (int i = 0; i <= n; i++) {
                    result1 += 1 / Math.pow(a, Math.pow(2, i));
                }
                System.out.println("Результат: " + result1);
                break;
            case 2:
                double result2 = 1;
                for (int i = 1; i <= n; i++) {
                    result2 *= a - n * i;
                }
                result2 *= a;
                System.out.println("Результат: " + result2);
                break;
            default:
                System.out.println("Такой опции нет :/");
        }
    }

    private static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n - длину массива");
        int n = scanner.nextInt();
        double[] ints = new double[n];
        int cnt = 0;
        while(cnt < n) {
            System.out.println("Вводите " + (cnt+1) + "ый элемент");
            ints[cnt] = scanner.nextDouble();
            cnt ++;
        }
        System.out.println("Массив задан: \n" +
                            "" + Arrays.toString(ints));
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < 0) {
                ints[i] += 0.5;
            }
            else {
                ints[i] = 0.1;
            }
        }
        System.out.println("Массив изменён: \n" +
                            "" + Arrays.toString(ints));
    }

    private static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов");
        int n = scanner.nextInt();
        int cnt = 0;
        int[] ints = new int[n];
        while(cnt < n) {
            System.out.println("Вводите " + (cnt + 1) + "-ый элемент");
            ints[cnt] = scanner.nextInt();
            cnt ++;
        }
        int count = 0;
        String[] numbers = pereborMassiva(ints);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != null) {
                count++;
            }
        }
        String message = count == 2 ? "Массив прошёл проверку" : "Массив не прошёл проверку";
        System.out.println(message);
    }

    private static String[] pereborMassiva(int[] ints) {
        String[] retInts = new String[ints.length];
        for (int i = 0; i < ints.length; i++) {
            String number = Integer.toString(ints[i]);
            int cnt = 0;
            for (int j = 0; j < number.length(); j++) {
                if ((number.length() == 3 || number.length() == 5) && number.charAt(j) % 2 == 0) {
                    cnt ++;
                }
            }
            if (cnt == number.length()) {
                retInts[i] = number;
            }
        }
        return retInts;
    }

    private static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два неравных целых числа");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        double d1 = m / n;
        double d2 = n / m;
        double del1 = Math.abs(d1 - Math.PI);
        double del2 = Math.abs(d2 - Math.PI);
        int result = del2 > del1 ? m * 10 : n * 2;
        System.out.println(result);
    }

    private static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int length = scanner.nextInt();
        int[] ints = new int[length];
        System.out.println("Вводите целочисленные элементы");
        ints[0] = scanner.nextInt();
        ints[1] = scanner.nextInt();
        boolean flag = false;
        int max = 0;
        for (int i = 2; i < length; i++) {
            ints[i] = scanner.nextInt();
            boolean log = ints[i-1] > ints[i-2] && ints[i-1] > ints[i] && ints[i-1] % 2 == 0;
            if (!flag && log) {
                flag = true;
                max = ints[i-1];
            } else {
                if (log) {
                    System.out.println("Найденные локальные максимумы: " + max + " " + ints[i-1]);
                    break;
                }
            }
        }
    }

    private static void task1() {
        Scanner scanner = new Scanner(System.in);

        int k, n;

        do {
            System.out.println("Введите основание системы счисления k (2 <= k < 9): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Я просил ЦЕЛОЕ число!");
                scanner.next();
            }
            k = scanner.nextInt();
        } while (k < 2 || k >= 9);

        do {
            System.out.println("Введите число n, которое можно записать в \" + k + \"-ичной системе счисления: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Я просил ЦЕЛОЕ!");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (!isValidToKBAse(n, k));

        int decimalValue = convertToDecimal(n, k);
        System.out.println("Число " + n + " в десятичной системе счисления: " + decimalValue);
    }

    public static int convertToDecimal(int n, int k) {
        int result = 0;
        n = Math.abs(n);
        String number = Integer.toString(n);
        for (int i = 0; i < number.length(); i++) {
            int digit = number.charAt(i) - '0';
            result += digit * (int)(Math.pow(k, number.length() - i - 1));
        }
        return result;
    }

    public static boolean isValidToKBAse(int n, int k) {
        n = Math.abs(n);
        while (n > 0) {
            if (n % 10 >= k) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}
