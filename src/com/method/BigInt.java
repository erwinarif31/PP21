package com.method;

import java.util.Arrays;

public class BigInt {
    /**
     * Adds two arrays as the sum of two numbers, this method is akin to the add
     * method from BigInteger class
     *
     * @param n the array to be used as addend, first operand
     * @param m the array to be used as addend, second operand
     * @return array of integer that represents the sum of 2 numbers
     */
    public static int[] add(int[] n, int[] m) {
        int sumLength = (n.length > m.length) ? n.length : m.length;
        int[] sum = new int[sumLength];

        for (int i = 1; i <= sum.length; i++) {
            int arrIndex = sumLength - i;

            if (n.length - i >= 0) {
                sum[arrIndex] += n[n.length - i];
            }

            if (m.length - i >= 0) {
                sum[arrIndex] += m[(m.length - i)];
            }

            if (sum[arrIndex] >= 10 && arrIndex != 0) {
                sum[arrIndex - 1] += sum[arrIndex] / 10;
                sum[arrIndex] = sum[arrIndex] % 10;
            }
        }

        /** If sum[0] more than 10 */
        if (sum[0] >= 10) {
            /** Array to store old sum value */
            int[] temp = new int[sum.length];
            for (int i = 0; i < sum.length; i++) {
                temp[i] = sum[i];
            }

            sum = new int[temp.length + 1];
            sum[0] = temp[0] / 10;
            sum[1] = temp[0] % 10;
            for (int i = 2; i < sum.length; i++) {
                sum[i] = temp[i - 1];
            }
        }
        return sum;
    }

    /**
     * Format number using human readable format, separated by dot(.)
     *
     * @param nums the array that represent a big number of integer
     * @return array of char that represent the formatted number
     */
    public static char[] humanFormat(int[] nums) {
        /**
         * 1. Cari modulo nums.length dan 3 2. Diberi titik setiap index+1 % 3 = modulo
         * no.1
         * 
         */
        int arrLength = nums.length + ((nums.length % 3 == 0) ? (nums.length / 3) - 1 : nums.length / 3);
        char[] arr = new char[arrLength];
        for (int i = 0, j = 0, index = 0; i < arr.length; i++) {
            if (index == 3 || (i == nums.length % 3 && i != 0)) {
                arr[i] = '.';
                index = 0;
            } else {
                arr[i] = (char) (nums[j] + '0');
                j++;
                index++;
            }
        }

        return arr;
    }

    /**
     * Format number using human readable format with specified separator
     *
     * @param nums      the array that represent a big number of integer
     * @param separator the character to be used as separator
     * @return array of char that represent the formatted number
     */
    public static char[] humanFormat(int[] nums, char sparator) {
        int arrLength = nums.length + ((nums.length % 3 == 0) ? (nums.length / 3) - 1 : nums.length / 3);
        char[] arr = new char[arrLength];
        for (int i = 0, j = 0, index = 0; i < arr.length; i++) {
            if (index == 3 || (i == nums.length % 3 && i != 0)) {
                arr[i] = sparator;
                index = 0;
            } else {
                arr[i] = (char) (nums[j] + '0');
                j++;
                index++;
            }
        }

        return arr;
    }

    /**
     * Print an array into a number format .e.g. {1, 0, 5} printed as 105
     *
     * @param nums the array to be printed as number
     * @return void
     */
    public static void print(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%d%s", nums[i], (i == nums.length - 1) ? "\n" : "");
        }
    }

    /**
     * Print an array into a human readable format of numbers .e.g. {'1', '_', 0, 0,
     * 0} printed as 1_000
     *
     * @param nums the array to be printed as number
     * @return void
     */
    public static void print(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            System.out.printf("%c%s", chars[i], (i == chars.length - 1) ? "\n" : "");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 1, 4, 7, 4, 8, 3, 6, 4, 7 };
        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] arr3 = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
        int[] arr4 = { 9, 9, 9 };
        char[] arr5 = { '1', '2', '3', '4' };

        System.out.println("\n----------------------------------");
        /** Test add() */
        int[] sum = add(arr1, arr1);
        System.out.println("\tTest add()\n");
        System.out.println(Arrays.toString(sum));
        System.out.println("----------------------------------\n");

        System.out.println("\n----------------------------------");
        /** Test humanFormat(int[]) */
        char[] resultChar = humanFormat(add(arr1, arr1));
        System.out.println("\tTest humanFormat()\n");
        System.out.println(Arrays.toString(resultChar));
        System.out.println("----------------------------------\n");

        System.out.println("\n----------------------------------");
        /** Test humanFormat(int[], char) */
        resultChar = humanFormat(arr4, 'x');
        System.out.println("\tTest humanFormat()\n");
        System.out.println(Arrays.toString(resultChar));
        System.out.println("----------------------------------\n");

        System.out.println("\n----------------------------------");
        /** Test print(int[] nums) */
        System.out.println("\tTest print()\n");
        print(arr1);
        System.out.println("----------------------------------\n");

        System.out.println("\n----------------------------------");
        /** Test print(char[] chars) */
        System.out.println("\tTest print()\n");
        resultChar = humanFormat(arr1);
        print(resultChar);
        System.out.println("----------------------------------\n");

    }
}
