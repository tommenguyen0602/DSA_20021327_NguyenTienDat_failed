import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.lang.Math.*;

import static java.lang.Math.abs;

public class Pairs {
    //unoptimised

    public static int numberofpairs(int[] arr, int k) {
        /*
        int count = 0;
        int size = arr.length;
        for (int i = 0; i < size-1; ++i) {
            for (int j = i  + 1; j < size; ++j) {
                if(abs(arr[j]-arr[i])==k) {
                    count++;
                }
            }
        }
        return count;
     */

        //optimised
        HashSet<Integer> set = new HashSet<>();
        for (int j : arr) set.add(j);
        int count = 0;
        for(int i:set)
        count+=(set.contains(i+k))?1:0;
        return count;

    }



    public static void main(String[] args) {
        int N;
        Scanner scn = new Scanner(System.in);
        N = scn.nextInt();
        int[] arr = new int[N];
        int k;
        k = scn.nextInt();
        for (int i = 0; i < N; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(numberofpairs(arr,k));
    }
}
