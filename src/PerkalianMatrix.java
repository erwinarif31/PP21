/**
 * 
 * @author Muhamad Erwin Arif
 * 
 */

public class PerkalianMatrix {
    public static void main(String[] args) {
        int[][] arr1 = { { 1, 1, 1 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] arr2 = { { 1, 3, 8 }, { 2, 4, 7 }, { 3, 6, 9 } };
        int row1 = arr1.length;
        int row2 = arr2.length;
        int col1 = arr1[0].length;
        int col2 = arr2[0].length;

        if (col1 == row2) {
            int[][] result = new int[row1][col2];

            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    for (int k = 0; k < row2; k++) {
                        result[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }

            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[0].length; j++) {
                    System.out.printf("%4d ", result[i][j]);
                }
                System.out.println();
            }
        } else {
            System.out.println("Perkalian tidak dapat dilakukan!");
        }
    }
}
