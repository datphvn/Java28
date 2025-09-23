package baitap;

import java.util.Scanner;

public class m2cBai4 {

    public static boolean palin(int n){
        int rev = 0, tmp = n;
        while (n!=0){
            rev = rev * 10 + n%10;
            n = n/10;
        }
        return rev == tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();

            }
        }

        int dem = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if(palin(a[i][j])){
                    ++dem;
                }
            }
        }
        System.out.println(dem);



    }
}
