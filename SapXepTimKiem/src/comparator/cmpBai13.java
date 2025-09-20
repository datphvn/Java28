package comparator;

import java.util.Scanner;

public class cmpBai13 {

    public static int lastPosition(int a[], int l, int r, int x){
        int res = -1;
        while (l <= r){
            int m = (l+r)/2;
            if (a[m] <= x){
                res = m;
                l = m+1;
            }
            else{
                r = m-1;
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
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int pos = lastPosition(a, 0, n-1, x);
        // pos : chi so cua thang lon nhat <= x
        if(pos == -1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println(a[pos]);
        }

    }
}
