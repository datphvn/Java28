package comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class cmpBai2 {

    public static int chan(int n) {
        if (n == 0) {
            return 1;
        }
        int ans = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                ++ans;
            }
            n = n / 10;
        }
        return ans;
    }

    public static int le(int n) {
        if (n == 0) {
            return 1;
        }
        int ans = 0;
        while (n != 0) {
            if (n % 2 == 1) {
                ++ans;
            }
            n = n / 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), X = sc.nextInt();
        Integer[] a = new Integer[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }

        Arrays.sort(a, new Comparator<Integer>() {

            @Override
            public int compare(Integer x, Integer y) {
                if (Math.abs(x - X) != Math.abs(y - X)) {
                    return Math.abs(x - X) - Math.abs(y - X);
                }
                return x - y;
            }
        });
        for (int x : a) {
            System.out.println(x + " ");
        }
        System.out.println("");
        Arrays.sort(a, new Comparator<Integer>() {

            @Override
            public int compare(Integer x, Integer y) {
                int r1 = x % 2, r2 = y % 2;
                if (r1 == 0 && r2 == 0) return x - y;
                if (r1 == 1 && r2 == 1) return y - x;
                if (r1 == 0 && r2 == 1) return -1;
                return 1;
            }
        });

        for (
                int x : a) {
            System.out.println(x + " ");
        }
    }

}
