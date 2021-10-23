import java.util.InputMismatchException;
import java.util.Scanner;

public class P0201 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start, end, size;
        
        try {
            start = scan.nextInt();
            end = scan.nextInt();
            size = scan.nextInt();
        } catch (InputMismatchException e) {
            //TODO: handle exception
            System.out.println("Masukkan input integer");
            return;
        }

        for (int i = start, j = 1; (start < end) ? i <= end : i >= end; j++) {
            System.out.printf("%03d ", i);
            if (j % size == 0) {
                System.out.println();
            }
            if (start < end) {
                i++;
            } else {
                i--;
            }
        }

    }
}