import java.util.Scanner;

public class SherlockandArray {
    public static String check(int[] arr, int middle) {

        return "NO";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println(check(arr,1));
        }
    }
}
