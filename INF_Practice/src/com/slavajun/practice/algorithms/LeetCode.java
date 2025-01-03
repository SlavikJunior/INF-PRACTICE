package com.slavajun.practice.algorithms;

public class LeetCode {

    public static void main(String[] args) {
        int[] ints1 = new int[] {1, 3};
        int[] ints2 = new int[] {2};

        double res = findMedianSortedArrays(ints1, ints2);
        System.out.println(res);

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int len = m + n;
        int[] ints = new int[len];

        for(int i = 0; i < m; i++) {
            ints[i] = nums1[i];
        }
        for(int i = 0; i < n; i++) {
            ints[m + i] = nums2[i];
        }

        ints = bubbleSort(ints);
        return getMed(ints);
    }

    public static double getMed(int[] ints) {
        int len = ints.length;
        if (len % 2 == 0) {
            return  (double) (ints[len / 2] + ints[len / 2 - 1]) / 2;
        } else {
            return ints[len / 2];
        }
    }

    public static int[] bubbleSort(int[] ints) {
        for(int i = 0; i < ints.length; i++) {
            for(int j = 0; j < ints.length - (i + 1); j++) {
                if (ints[j] > ints[j+1]) {
                    ints[j] ^= ints[j+1];
                    ints[j+1] ^= ints[j];
                    ints[j] ^= ints[j+1];
                }
            }
        }
        return ints;
    }

}
