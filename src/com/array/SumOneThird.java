package com.array;

public class SumOneThird {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };
        int sumWithOneThirdLength = 0;

        /** Mengurutkan array */
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

        /** agar angka yang di print rata kanan */
        int biggestNumber = arr[arr.length - 1];
        int space = 0;
        while (biggestNumber > 0) {
            biggestNumber /= 10;
            space++;
        }

        /** Elemen array yang termasuk arr.length / 3 */
        /** BUG */
        for (int i = 0; i < arr.length / 3; i++) {
            // Your Magic is Here
            int sum = 0;
            for (int j = i, y = 0; y < 3; j += (arr.length / 3), y++) {
                sum += arr[j];
                if (j != i) {
                    System.out.printf(" + %" + space + "d", arr[j]);
                } else {
                    System.out.printf("%" + space + "d", arr[j]);
                }
            }

            System.out.printf(" = %d\n", sum);

            if (arr.length % 3 != 0 && i == (arr.length / 3) - 1) {
                /** Elemen array yang tidak termasuk arr.length / 3 */
                sumWithOneThirdLength += sum;
                sum = 0;
                for (int j = (arr.length - (arr.length % 3)); j < arr.length; j++) {
                    sum += arr[j];
                    if (j != arr.length - (arr.length % 3)) {
                        System.out.printf(" + %" + space + "d", arr[j]);
                    } else {
                        System.out.printf("%" + space + "d", arr[j]);
                    }
                }
                System.out.printf(" = %d\n", sum);
            }

            sumWithOneThirdLength += sum;
        }

        System.out.print("Sum of ");
        for (int j = 0; j < arr.length; j++) {
            System.out.printf("[%d]", arr[j]);
        }
        System.out.printf(" = %d", sumWithOneThirdLength);
    }
}
