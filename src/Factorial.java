import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) throws InputMismatchException {
        Scanner scan = new Scanner(System.in);
        
        int number;
        long sum = 1;
        try {
            number = scan.nextInt();
            scan.close();
            if (number < 0) {
                throw new Exception();
            }
        } catch (Exception e){
            System.out.println("Masukkan nilai bilangan bulat >= 0");
            return;
        }
        
        System.out.printf("%d!", number);

        if (number != 0) {
            for (int i = number; i >= 1; i--) {
                sum*=i;
                if (i == number) {
                    System.out.printf(" = %d", i);
                } else {
                    System.out.printf(" x %d", i);
                }
            }
        } else {
            sum = 1;
        }
        
        System.out.printf(" = %d", sum);
    }
}
