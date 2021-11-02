
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = { 67, 1, 74, 100, 88, 98, 13, 81, 40, 7, 49, 87, 16, 90, 62, 41, 15, 5 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
