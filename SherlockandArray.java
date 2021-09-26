import java.util.Scanner;
//unoptimised
/*
optimisation approach

 */
public class SherlockandArray {

    public static String check(int[] arr, int middle) {
        int n = arr.length;
        int right_sum = 0;
        int left_sum  = 0;


        //mid = 0
        for (int j = 1; j < n;j++) {
            right_sum = right_sum + arr[j];
        }
        //System.out.println("left: " + left_sum + " right: "+ right_sum);
        if (right_sum == 0) {
            return "YES";
        }

        //mid = end;
        for (int j = 0; j < n-1;j++) {
            left_sum = left_sum + arr[j];
        }
        //System.out.println("left: " + left_sum + " right: "+ left_sum);
        if (left_sum == 0) {
            return "YES";
        }

        for (int i = middle; i < n - 1; i++ ) {
            left_sum = 0;
            right_sum = 0;

            for (int j = 0;j<i;j++) {
                left_sum = left_sum + arr[j];
            }
            for (int j = i + 1; j < n;j++) {
                right_sum = right_sum + arr[j];
            }
            //System.out.println("left: " + left_sum + " right: "+ right_sum);
            if (right_sum == left_sum) {
                return "YES";
            }
        }
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
            System.out.println(check(arr,0));
        }
    }
}
