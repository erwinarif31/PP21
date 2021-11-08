package com.array;

/**
 * 
 * @author Muhamad Erwin Arif
 * 
 */

public class PerkalianMatriks {
    public static void main(String[] args) {
        int[][] arr1 = { { 1, 1, 1 } };
        int[][] arr2 = { { 1 }, { 2 }, { 3 } };
        int row1 = arr1.length;
        int row2 = arr2.length;
        int col1 = arr1[0].length;
        int col2 = arr2[0].length;

        if (col1 == row2) {
            int[][] result = new int[row1][col2];

            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < arr2[0].length; j++) {
                    for (int k = 0; k < row2; k++) {
                        result[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }

            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[0].length; j++) {
                    System.out.printf("%d ", result[i][j]);
                }
                System.out.println();
            }
        } else {
            System.out.println("Perkalian tidak dapat dilakukan!");
        }

    }
}