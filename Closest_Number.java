import java.util.Arrays;
import java.util.Scanner;
//pass all test case
import java.lang.Math;

import static java.lang.Math.abs;

public class Closest_Number {
    public static void findclosest(int[] arr, int N) {
        int dif = arr[1]-arr[0];
        int newdif;
        for (int i = 1; i < N - 1; i++) {
            newdif = arr[i+1] - arr[i];
            if (newdif <= dif) dif = newdif;
            //System.out.println("closest: " + dif);
        }
        for (int i = 0; i < N - 1; i++) {
            if (arr[i+1]-arr[i] == dif)
                System.out.print(arr[i] + " " + arr[i + 1] + " ");
        }

    }

    public static void main(String[] args) {
        int N;
        Scanner scn = new Scanner(System.in);
        N = scn.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);
        findclosest(arr, N);

    }
}
