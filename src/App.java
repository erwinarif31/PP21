
public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = { 10, 8, 9, 14, 11, 6, 15, 2, 3, 1, 5, 12, 13, 4, 7, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
                28, 29, 30 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
