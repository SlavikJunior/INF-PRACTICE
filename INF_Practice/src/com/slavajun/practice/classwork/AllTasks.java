package com.slavajun.practice.classwork;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class AllTasks {

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
//        task11();
//        task12();
//        task13();
        task14();

    }
    private static void task14() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел (n): ");
        int n = scanner.nextInt();
        System.out.print("Введите индекс элемента, который нужно исключить (i): ");
        int i = scanner.nextInt();
        double[] array = new double[n];
        System.out.println("Введите " + n + " чисел:");
        for (int j = 0; j < n; j++) {
            array[j] = scanner.nextDouble();
        }
        double totalSum = 0.0;
        for (double num : array) {
            totalSum += num;
        }
        double excludedElement = array[i - 1];
        double adjustedSum = totalSum - excludedElement;
        double average = adjustedSum / (n - 1);
        System.out.println("Среднее арифметическое (без элемента a[" + i + "]): " + average);
    }
    private static void task13() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вещественное и натуральное числа");
        double a = scanner.nextDouble();
        int n = scanner.nextInt();
        System.out.println("Выберите действие: \n" +
                            "1\n" +
                            "2\n" +
                            "3");
        int move = scanner.nextInt();
        switch (move) {
            case 1:
                System.out.println(Math.pow(a, n));
                break;
            case 2:
                double mult = 1;
                for (int i = 0; i < n; i++) {
                    mult *= (a + i);
                }
                System.out.println("Результат: " + mult);
                break;
            case 3:
                double sum = 0;
                for (int i = 0; i <= n; i++) {
                    double denominator = 1.0;
                    for (int j = 0; j <= i; j++) {
                        denominator *= (a + j);
                    }
                    sum += 1.0 / denominator;
                }
                System.out.println("Результат: " + sum);
                break;
            default:
                System.out.println("Такого режима не существует");
        }
    }
    private static void task12() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите режим:\n" +
                            "1\n" +
                            "2");
        int mode = scanner.nextInt();
        System.out.println("Введите аргумент, функцию от которого хотите сосчитать");
        double x = scanner.nextDouble();
        switch (mode) {
            case 1:
                if (x >= -2 && x <= 2) {
                    System.out.println(x * x);
                }
                else {
                    System.out.println(4);
                }
                break;
            case 2:
                if (x <= 2) {
                    System.out.println(x * x + 4 * x + 5);
                }
                else {
                    System.out.println(1 / (x * x + 4 * x + 5));
                }
                break;
            default:
                System.out.println("Такого режима нет!");
        }
    }
    private static void task11() {
        Scanner scanner = new Scanner(System.in);
        long mult = 1;
        boolean flag = false;

        System.out.println("Вводите числа (введите 0 для выхода)");
        while (true) {
            int scanNum = scanner.nextInt();

            if (scanNum == 0) {
                break;
            }

            if (scanNum % 7 == 0) {
                mult *= scanNum;
                flag = true;
            }
        }

        if (flag) {
            System.out.println("Произведение чисел, кратных 7: " + mult);
        } else {
            System.out.println("Нет чисел, кратных 7.");
        }

        scanner.close();
    }
    private static void task10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину последовательности");
        int len = scanner.nextInt();
        double[] doubles = genArray(len);
        double sum = 0;
        for (double temp : doubles) {
            if (temp > 0) {
                sum += (temp * 2);
            }
        }
        System.out.println(sum);
    }
    private static void task9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину последовательности");
        int length = scanner.nextInt();
        System.out.println("Через Enter введите максимальное и минимальное значение элемента в массиве");
        int maxEl = scanner.nextInt();
        int minxEl = scanner.nextInt();
        int[] ints = genArray(length, maxEl, minxEl);
        int sum = 0;
        int cnt = 0;
        for (int temp : ints) {
            if (temp % 5 == 0 && temp % 7 != 0) {
                cnt += 1;
                sum += temp;
                System.out.println(temp);
            }
        }
        System.out.println("Количество искомых элементов: " + cnt);
        System.out.println("Сумма искомых элементов: " + sum);
    }
    private static void task8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int length = scanner.nextInt();
        System.out.println("Через Enter введите максимальное и минимальное значение элемента в массиве");
        int maxEl = scanner.nextInt();
        int minxEl = scanner.nextInt();
        int[] ints = genArray(length, minxEl, maxEl);
        boolean flag = false;
        System.out.println(Arrays.toString(ints));
        for (int i = 1; i < ints.length - 1; i++) {
            if (ints[i] > ints[i-1] && ints[i] > ints[i+1] && ints[i] % 2 == 0) {
                System.out.println("Искомое число: " + ints[i]);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Таких чисел не нашлось :/");
        }
    }
    private static int[] genArray(int length, int maxEl, int minEl) {
        Random random = new Random();
        int [] ints = new int[length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(minEl, maxEl + 1);
        }
        return ints;
    }
    private static double[] genArray(int length) {
        Random random = new Random();
        double[] doubles = new double[length];
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = random.nextDouble();
        }
        return doubles;
    }
    private static void task7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два целых и одно вещественное число через Enter");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double z = scanner.nextDouble();
        int x = a % b;
        z = x == 0 ? z * x : z / x;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("x: " + x);
        System.out.println("z: " + z);
    }
    private static void task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите через Enter два числа:\n" +
                            "Высоту и ширину таблицы");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("1 ");
            }
            System.out.println();
        }
    }
    private static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца!");
        int month = scanner.nextInt();
        int cntMonth = 12;
        System.out.println("До конца года: " + (cntMonth - month));
    }
    private static void task4() {
        Scanner scanner = new Scanner(System.in);
        char inputChar;
        while(true) {
            System.out.println("Введите строчную букву от a до f");
            String input = scanner.nextLine();
            if (input.length() == 1) {
                inputChar = input.charAt(0);
                if (inputChar >= 'a' && inputChar <= 'f') {
                    break;
                }
            }
            System.out.println("Ошибка! Потоврите попытку!");
        }
        char upperCaseChar = Character.toUpperCase(inputChar);
        System.out.println("Заглавная буква: " + upperCaseChar);
    }
    private static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите действительное число!");
        double d = scanner.nextDouble();
        System.out.println("1 Возвести в квадрат\n" +
                            "2 Извлечь кв корень\n" +
                            "3 Вычислить синус\n" +
                            "4 Вычислить косинус");
        int move = scanner.nextInt();
        String message = switch (move){
            case 1 -> Double.toString(Math.pow(d, 2));
            case 2 -> Double.toString(Math.pow(d, 0.5));
            case 3 -> Double.toString(Math.sin(d));
            case 4 -> Double.toString(Math.cos(d));
            default -> "Некорректный ввод!";
        };
        System.out.println(message);
    }
    private static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время (часы)");
        int hours = scanner.nextInt();
        String message = "";
        if (hours >= 5 & hours < 11) {
            message = "Доброго утра!";
        }
        else if (hours >= 11 & hours < 17) {
            message = "Доброго дня!";
        }
        else if (hours >= 17 & hours < 23) {
            message = "Доброго вечера!";
        }
        else {
            message = "Доброй ночи!";
        }
        System.out.println(message);
    }
    private static void task1() {
        System.out.println("Введите оценку от 1 до 5");
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();
        String message = switch (mark) {
            case 1 -> "Плохо";
            case 2 -> "Неудовлетворительно";
            case 3 -> "Удовлетворительно";
            case 4 -> "Хорошо";
            case 5 -> "Отлично";
            default -> "Некорректный ввод!";
        };
        System.out.println(message);
    }
}
