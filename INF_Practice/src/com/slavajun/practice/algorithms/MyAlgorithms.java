package com.slavajun.practice.algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class MyAlgorithms {

    public static void main(String[] args) {

    }

    public static int linearSearch(int[] ints, int point) {
        int len = ints.length;
        for (int i = 0; i < len; i++) {
            if (ints[i] == point) {
                return i;
            }
        }
        return - 1;
    }

    public static int binarySearch(int[] ints, int point) {
        int left = 0;
        int right = ints.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int temp = ints[mid];

            if (temp == point) {
                return mid;
            }

            else if (temp < point) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }
        return - 1;
    }

    public static int[] bubbleSort(int[] ints) {
        int len = ints.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - (i + 1); j++) {
                if (ints[j] > ints[j + 1]) {
                    ints[j] ^= ints[j + 1];
                    ints[j + 1] ^= ints[j];
                    ints[j] ^= ints[j + 1];
                }
            }
        }
        return ints;
    }

    public static String reverseString(String input) {
        char[] elements = input.toCharArray();
        int len = elements.length;
        for (int i = 0, j = len - 1; i < j; i++, j--) {
            elements[i] ^= elements[j];
            elements[j] ^= elements[i];
            elements[i] ^= elements[j];
        }
        return new String(elements);
    }

//    public static int[] quickSort(int[] ints) {
//        int len = ints.length;
//
//        if (len < 2) {
//            return ints;
//        }
//
//        else if (len == 2) {
//            if (ints[0] > ints[1]) {
//                ints[0] ^= ints[1];
//                ints[1] ^= ints[0];
//                ints[0] ^= ints[1];
//            }
//            return ints;
//        }
//
//        else {
//            int cntLow = 0;
//            int cntHigh = 0;
//            int mark = ints[0];
//
//            for (int i = 0; i < len; i++) {
//                if (ints[i] < mark) {
//                    cntLow++;
//                }
//                else {
//                    cntHigh++;
//                }
//            }
//            int[] lowEls = new int[cntLow];
//            int[] highEls = new int[cntHigh];
//
//            for (int i = 0; i < len; i++) {
//                if (ints[i] < mark) {
//                    lowEls[i] = ints[i];
//                }
//                else {
//                    highEls[i] = ints[i];
//                }
//            }
//            как то нужно сконкватенировать массивы...
//            return quickSort(lowEls) + mark + highEls;
//        }
//    }
    public static long fact(int x) {
        if (x == 1) {
            return 1;
        }
        return x * fact(x - 1);
    }

    public static int evklidovAlrorithm(int x, int y) {
        if (x < y) {
            x ^= y;// тоже самое что и свап с помощью дополнительной переменной
            y ^= x;
            x ^= y;
        }

        if (x % y == 0) {
            return y;
        }
        else {
            int delta = x % y;
            return evklidovAlrorithm(delta, y);
        }
    }

    public static long sum(int[] ints) {
        int len = ints.length;

        if (len == 0) {
            return 0;
        }

        else if (len == 1) {
            return ints[0];
        }

        else {
            int id = ints.length - 1;
            int[] newInts = Arrays.copyOf(ints, len - 1);
            return ints[id] + sum(newInts);
        }
    }

}
