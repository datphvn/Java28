package comparator;

import java.util.Arrays;
import java.util.Scanner;

public class cmpBai18 {
    public static int firstPos(int a[], int l, int r, int x) {
        int res = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == x) {
                res = m;
                r = m - 1; // tiep tuc tim kiem o ben trai
            } else if (a[m] > x) {
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
            int m = l + (r - l) / 2;
            if (a[m] == x) {
                res = m;
                l = m + 1;

            } else if (a[m] < x) {
                l = m + 1;

            } else {
                r = m - 1;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        long ans = 0;
        for (int i = 0; i < k; i++) {
            int p1 = firstPos(a, i + 1, n - 1, a[i] + k);
            int p2 = lastPos(a, i + 1, n - 1, a[i] - k);
            if(p1 != -1){
                ans += p2 - p1 + 1;
            }
        }
        System.out.println(ans);


    }
}
