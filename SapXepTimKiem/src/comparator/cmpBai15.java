package comparator;

import java.util.Arrays;
import java.util.Scanner;

public class cmpBai15 {
    //vi tri cuoi cung cua phan tu < X trong mang tang dan
    public static int firstPosition(int a[], int l, int r, int x){
        int res = -1;
        while (l <= r){
            int m = (l+r)/2;
            if (a[m] > x){
                res = m;
                r = m-1;

            }

            else{
                l = m+1;
            }
        }
        return res;
    }
    public static boolean bianarySearch(int a[], int l, int r, int x ){
        while (l <= r) {
            int m = (l+r)/2;
            if(a[m] == x)
                return true;
            else if (a[m] < x) {
                l = m + 1;
            }
            else
                r = m - 1;
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);
        for(int x : a){
            int pos = firstPosition(a,0,m-1,x);
            if(pos == -1){
                System.out.print("0");
            }
            else{
                System.out.print(m - pos + " ");
            }
        }

    }
}
