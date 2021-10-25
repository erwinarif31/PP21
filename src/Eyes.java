import java.util.Scanner;
public class Eyes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size;
        try {
            size = scan.nextInt();
            scan.close();
            if (size <= 0) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.print("Masukkan input size >= 0");
            return;
        }

        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size ; j++) {
                if (j == i) {
                    System.out.printf("1 ");
                } else {
                    System.out.printf("0 ");
                }
            }
            System.out.println();
        }
    }
}
