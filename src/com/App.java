package com;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * CountEach
 *
 * Assignment 3.1
 *
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
 *
 */
public class App {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };
        int sum = 0;
        for (int index = 0; index < (arr.length / 3); index++) {
            sum = 0;
            for (int j = 0; j < 3; j++) {
                int deret = index + (j * (arr.length / 3));
                sum = sum + arr[deret];
                if (j == 2) {
                    System.out.println(arr[deret] + " = " + sum);
                    ;
                } else {
                    System.out.print(arr[deret] + " + ");
                }
                if (index == (arr.length / 3) - 1 && j == 2) {
                    sum = 0;
                    for (int k = ++deret; k < arr.length; k++) {
                        sum += arr[k];
                        System.out.printf("%d%s", arr[k], (k != arr.length - 1) ? " + " : " = " + sum + "\n");
                    }
                }
            }
        }
        System.out.print("Sum of ");
        sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.print("[" + arr[i] + "]");
        }
        System.out.println(" = " + sum);

        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };
        // int sumWithOneThirdLength = 0;

        // /** Mengurutkan array */
        // for (int i = 0; i < arr.length; i++) {
        // int subs;
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[i] > arr[j]) {
        // subs = arr[i];
        // arr[i] = arr[j];
        // arr[j] = subs;
        // }
        // }
        // }

        // /** Agar angka yang di print rata kanan */
        // int biggestNumber = arr[arr.length - 1];
        // int space = 0;
        // while (biggestNumber > 0) {
        // biggestNumber /= 10;
        // space++;
        // }

        // for (int i = 0; i < arr.length / 3; i++) {
        // // Your Magic is Here
        // int oneThirdOfArr = arr.length / 3;
        // int sum = 0;
        // int j = i;

        // for (int k = 0; k < 3; k++) {
        // sum += arr[j];
        // System.out.printf("%s%" + space + "d", (j != i) ? " + " : "", arr[j]);
        // j += oneThirdOfArr;
        // }
        // sumWithOneThirdLength += sum;
        // System.out.printf(" = %d\n", sum);

        // if (i == (oneThirdOfArr - 1)) {
        // sum = 0;
        // for (int k = oneThirdOfArr * 3; k < arr.length; k++) {
        // sum += arr[k];
        // System.out.printf("%" + space + "d%s", arr[k], (k != arr.length - 1) ? " + "
        // : " = " + sum + "\n");
        // }
        // System.out.printf("\n");
        // sumWithOneThirdLength += sum;

        // System.out.print("Sum of ");
        // for (int index = 0; index < arr.length; index++) {
        // System.out.printf("[%d]", arr[index]);
        // }
        // System.out.printf(" = %d", sumWithOneThirdLength);
        // }
        // }

        // // System.out.print("Sum of ");
        // // for (int j = 0; j < arr.length; j++) {
        // // System.out.printf("[%d]", arr[j]);
        // // }
        // // System.out.printf(" = %d", sumWithOneThirdLength);
    }
}