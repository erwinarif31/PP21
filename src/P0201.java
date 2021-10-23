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


    }
}