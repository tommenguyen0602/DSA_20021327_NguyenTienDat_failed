import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] a,int l, int r, int number) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (a[mid] == number)
                return mid;

            if (a[mid] > number)
                return binarySearch(a, l, mid - 1, number);

            return binarySearch(a, mid + 1, r, number);
        }
        return -1;
    }
    public static void main(String[] args) {
        In in = new In("D:\\java_libs\\algs4-data\\algs4-data\\8ints.txt");
        int[] a = in.readAllInts();

        Arrays.sort(a);
        System.out.print(binarySearch(a,0,a.length-1,40));
    }
}
