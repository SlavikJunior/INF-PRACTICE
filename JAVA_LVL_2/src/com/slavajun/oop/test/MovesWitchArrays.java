package com.slavajun.oop.test;

import java.util.Scanner;

public class MovesWitchArrays {

    public static void main(String[] args) {

        Scanner adapter = new Scanner(System.in);
        System.out.println("Input arrays length please");
        int length = adapter.nextInt();
        int[] ints = new int[length];


        for (int i = 0; i < length; i++) {
            double d = Math.random();

            ints[i] = fromRandomDoubleToRandomInt(d);

            }

        for (int el : ints) {
            System.out.print(el + " ");
        }
        System.out.println();

        int[] res2 = searchExt(length, ints);
        for (int i = 0; i < res2.length; i++) {
            switch (i) {
                case 0:
                    String str0 = "Sum elements: %d ";
                    System.out.println(String.format(str0, res2[i]));
                    break;
                case 1:
                    String str1 = "Arithmetic mean of numbers: %d ";
                    System.out.println(String.format(str1, res2[i]));
                    break;
                case 2:
                    String str2 = "Max of elements: %d ";
                    System.out.println(String.format(str2, res2[i]));
                    break;
                case 3:
                    String str3 = "Min of elements: %d";
                    System.out.println(String.format(str3, res2[i]));
            }

        }



    }

    public static int[] searchExt(int length, int[] ints) {

        int min = 100000;
        int max = -100000;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += ints[i];
            if (ints[i] > max)
                max = ints[i];
            if (ints[i] < min)
                min = ints[i];
        }
        int srAr = sum / length;
        int[] reult = {sum, srAr, max, min};
        return reult;
    }

    public static int fromRandomDoubleToRandomInt(double d) {
        return (int) ((d * 1000));
    }



}
