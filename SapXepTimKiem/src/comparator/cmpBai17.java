package comparator;

import java.util.Arrays;
import java.util.Scanner;

public class cmpBai17 {
    public static int firstPos(int a[], int l, int r, int x) {
        int res = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] >= x) {
                res = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return res;
    }

    public static int lastPos(int a[], int l, int r, int x) {
        int res = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if(a[m] <= x){
                res = m;
                l = m + 1;
            }
            else{
                r = m - 1;
            }
        }
        return res;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt(), r = sc.nextInt();
            int first = firstPos(a, 0, n - 1, l);
            int last = lastPos(a, 0, n - 1, r);
            if(first == -1){
                System.out.println(0 + " ");
            }
            else{
                System.out.println(last - first + 1 + " ");
            }
        }

    }
}
