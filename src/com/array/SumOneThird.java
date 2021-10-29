package com.array;

import java.util.concurrent.ForkJoinPool;

public class SumOneThird {
    public static void main(String[] args) {
        int[] arr = { 10, 8, 9, 14, 11, 6, 15, 2, 3, 1, 5, 12, 13, 4, 7, 16, 17 };
        int sumWithOneThirdLength = 0;

        /** Sorting Array */
        for (int i = 0; i < arr.length; i++) {
            int subs = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    subs = arr[i];
                    arr[i] = arr[j];
                    arr[j] = subs;
                }
            }
        }
        int biggestNumber = arr[arr.length - 1];
        int space = 0;
        while (biggestNumber > 0) {
            biggestNumber /= 10;
            space++;
        }

        for (int i = 0; i < arr.length / 3; i++) {
            // Your Magic is Here
            int sum = 0;
            for (int j = i; j < (i + 2 * arr.length / 3); j += (arr.length / 3)) {
                sum += arr[j];
                if (j != i) {
                    System.out.printf(" + %" + space + "d", arr[j]);
                } else {
                    System.out.printf("%" + space + "d", arr[j]);
                }
            }

            System.out.printf(" = %d\n", sum);
            sumWithOneThirdLength += sum;

        }

        if (arr.length % 3 != 0) {
            int sum = 0;
            for (int i = (arr.length - (arr.length % 3)); i < arr.length; i++) {
                sum += arr[i];
                if (i != arr.length - (arr.length % 3)) {
                    System.out.printf(" + %" + space + "d", arr[i]);
                } else {
                    System.out.printf("%" + space + "d", arr[i]);
                }
            }
            System.out.printf(" = %d\n", sum);
            sumWithOneThirdLength += sum;
        }

        System.out.print("Sum of ");
        for (int j = 0; j < arr.length; j++) {
            System.out.printf("[%d]", arr[j]);
        }
        System.out.printf(" = %d", sumWithOneThirdLength);
    }
}
