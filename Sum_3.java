import edu.princeton.cs.algs4.*;
public class Sum_3 {
    public static int count(int a[]) {
        int count = 0;
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j +1 ; k < N; k++) {
                    if(a[i] + a[j] + a[k] == 0) count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int a[] ={-10,-20,-30,10,20,30};
        StdOut.println(count(a));
    }
}
