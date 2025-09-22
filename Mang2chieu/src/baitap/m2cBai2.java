package baitap;

import java.util.Scanner;

public class m2cBai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            long tong = 0;
            for (int j = 0; j < m; j++) {
                tong += a[i][j];
            }
            System.out.print (tong + " ");
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            long tong = 0;
            for(int j = 0; j < n; j++){
                tong += a[j][i];
            }
            System.out.print(tong + " ");
        }
    }
}
