package com.array;

import java.util.Scanner;

public class Radix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        int[] binary;
        int[] octal;
        int[] hexa;

        try {
            n = scan.nextInt();
            scan.close();
            if (n < 0 && n > 255) {
                throw new Exception();
            }
            binary = new int[8];
            octal = new int[8];
            hexa = new int[8];
        } catch (Exception e) {
            return;
        }

        // /** Decimal to Binary */
        int decimal = n;
        System.out.printf("base %2d: ", 2);
        for (int i = (binary.length - 1); decimal > 0; i--) {
            binary[i] = (decimal % 2);
            decimal /= 2;
        }

        for (int i = 0; i < binary.length; i++) {
            System.out.printf("%d", binary[i]);
        }
        System.out.println();

        /** Decimal to Octal */
        decimal = n;
        System.out.printf("base %2d: ", 8);
        for (int i = (octal.length - 1); decimal > 0; i--) {
            octal[i] = (decimal % 8);
            decimal /= 8;
        }

        for (int i = 0; i < octal.length; i++) {
            System.out.printf("%d", octal[i]);
        }
        System.out.println();

        /** Decimal to Hexagonal */
        decimal = n;
        System.out.printf("base %2d: ", 16);
        for (int i = (hexa.length - 1); decimal > 0; i--) {
            int modulo = (decimal % 16);
            hexa[i] = (modulo > 9) ? (modulo + 55) : modulo;
            decimal /= 16;
        }

        for (int i = 0; i < octal.length; i++) {
            if (hexa[i] > 9) {
            System.out.printf("%s", (char) hexa[i]);
            } else {
            System.out.printf("%d", hexa[i]);
            }
            // System.out.printf("%s", (hexa[i] > 9) ? (char) hexa[i] : hexa[i]);

        }
    }
}
