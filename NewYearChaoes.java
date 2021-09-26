import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

//failed
import static java.lang.Math.abs;
import static java.lang.Math.max;

public class NewYearChaoes {
    public static void cal(int[] arr){
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--){
            if (arr[i]-(i+1) > 2) {
                System.out.println("Too chaotic");
            }

            for (int j = max(0,arr[i]-2);j < i;j++)
                if (arr[j] > arr[i]) count ++;
        }
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
            cal(arr);
        }
    }
}
