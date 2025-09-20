package comparator;

import java.util.Scanner;

public class cmpBai3 {

    public static int firstPos(int a[], int l, int r, int x) {
        int res = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == x) {
                res = m;
                r = m -1;

            }
            else if (a[m] > x) {
                r = m - 1;
            }
            else {
                l = m + 1;
            }
        }
        return res;
    }

    public static int lastPos(int a[], int l, int r, int x){
        int res = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == x) {
                res = m;
                l = m + 1;

            }
            else if (a[m] < x) {
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }
        return res;
    }

    public static int ham1(int a[], int l, int r, int x) {
        int res = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] >= x) {
                res = m;
                r = m -1;

            }

            else {
                l = m + 1;
            }
        }
        return res;
    }

    public static int ham2(int a[], int l, int r, int x) {
        int res = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] > x) {
                res = m;
                r = m -1;

            }

            else {
                l = m + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        System.out.println(ham1(a, 0, n - 1, x));
        System.out.println(ham2(a, 0, n - 1, x));
        int first = firstPos (a, 0, n - 1, x);
        int last = lastPos (a, 0, n - 1, x);
        System.out.println(first + "\n " + last);
        if(first == -1){
            System.out.println("0");
        }
        else{
            System.out.println(last - first + 1);
        }
    }
}
