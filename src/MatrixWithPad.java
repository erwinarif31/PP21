import java.util.InputMismatchException;
import java.util.Scanner;

public class MatrixWithPad {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start, end, size;
        
        try {
            start = scan.nextInt();
            end = scan.nextInt();
            size = scan.nextInt();
            scan.close();
        } catch (InputMismatchException e) {
            System.out.println("Masukkan input integer");
            return;
        }
        
        for (int i = start; (start < end) ? i <= end : i >= end;) {
            if ((start - i) % size == 0 || (i - start) % size == 0) {
                System.out.println();
            }
            System.out.printf("%03d ", i);
            if (start < end) {
                i++;
            } else {
                i--;
            }
        }
    }
}