package com.slavajun.practice.algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class MyAlgorithms {

    public static void main(String[] args) {
        int[] ints = {1, 0, 4, 2, 6 ,5, 3, 9, 8, 11, 10};
        System.out.println(Arrays.toString(ints));
        quickSort(ints, 0, ints.length - 1);
        System.out.println(Arrays.toString(ints));
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

    public static void quickSort(int[] ints, int from, int to) {
        if (from < to) {
            int devId = partition(ints, from, to);
            quickSort(ints, from, devId - 1);
            quickSort(ints, devId, to);
        }
    }

    private static int partition(int[] ints, int from, int to) {
        int rightId = to;
        int leftId = from;

        int pivot = leftId + (rightId - leftId) / 2;
        while (leftId <= rightId) {
            while (ints[leftId] < pivot) {
                leftId++;
            }
            while (ints[rightId] > pivot) {
                rightId--;
            }
            if (leftId <= rightId) {
                swap(ints, rightId, leftId);
                leftId++;
                rightId--;
            }
        }
        return leftId;
    }

    private static void swap(int[] ints, int id1, int id2) {
        ints[id1] ^= ints[id2];
        ints[id2] ^= ints[id1];
        ints[id1] ^= ints[id2];
    }
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
