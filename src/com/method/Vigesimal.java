package com.method;

public class Vigesimal {

    /**
     * Convert a radix-10 (decimal) number into radix-20 (vigesimal) number
     *
     * @param n the radix-10 number to be converted
     * @return array of char that represent the radix-20 format
     */
    public static char[] toVigesimal(int n) {
        int length = (n >= 20) ? 2 : 1;
        char[] arr = new char[length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int modulo = (n % 20);
            arr[i] = (modulo > 9) ? (char) (modulo + 55) : (char) (modulo + '0');
            n /= 20;
        }
        return arr;
    }

    /**
     * Print the vigesimal multiplication table
     *
     * @return void
     */
    public static void table() {

        for (int i = 1; i < 20; i++) {
            for (int index = 1; index < 20; index++) {
                char[] arr = toVigesimal((i * index));
                System.out.printf("%s", (index != 1) ? "\t" : "");
                for (char c : arr) {
                    System.out.printf("%s", c);
                }
            }
            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {
        table();
    }
}
