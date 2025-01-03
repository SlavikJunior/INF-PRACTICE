package com.slavajun.oop.test;

import java.util.Arrays;

public class BubbleSorterPractice {

    public static void main(String[] args) {

        int[] a = {9, 4, 3, 2, 7, 10, 16, 5, 1, 0};
        sorting(a);

    }

    public static int[] sorting(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = a.length - 1; j > i ; j--) {
                if (a[j-1] > a[j]) {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println(Arrays.toString(a));
        }
        return a;
    }
}
