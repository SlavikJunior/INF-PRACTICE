package com.slavajun.practice.test;

import java.util.Arrays;
import java.util.Random;

public class TestArrays {

    public static void main(String[] args) {

        int[] ints = new int[] {1, 2, 3, 4, 5};

        int spliter = 3;
        int cntLow = 0;
        int cntNotLow = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < spliter) {
                cntLow++;
            }
            else {
                cntNotLow++;
            }
        }
        int[] lows = new int[cntLow];
        int[] notLows = new int[cntNotLow];
        int lowId = 0;
        int notLowId = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < spliter) {
                lows[lowId++] = ints[i];
            }
            else {
                notLows[notLowId++] = ints[i];

            }
        }
        System.out.println(Arrays.toString(ints));
        System.out.println(spliter);
        System.out.println(Arrays.toString(lows));
        System.out.println(Arrays.toString(notLows));

        int[] result = new int[lows.length + notLows.length + 1];
        for (int i = 0; i < lows.length; i++) {
            result[i] = lows[i];
        }

    }
}
