package baitap;

import java.util.Scanner;

public class m2cBai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] a = new int[n][m];
        int minVal = (int) 1e9, maxVal = -(int) 1e9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
                minVal = Math.min(a[i][j], minVal);
                maxVal = Math.max(a[i][j], maxVal);
            }
        }
        System.out.println(minVal);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == minVal) {
                    System.out.println((i + 1) + " " + (j + 1));
                }
            }
        }

        System.out.println(maxVal);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == maxVal) {
                    System.out.println((i + 1) + " " + (j + 1));
                }
            }
        }

    }
}
