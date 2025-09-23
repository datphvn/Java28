package baitap;

import java.util.Scanner;

public class m2cBai16 {

    public static int[] dx = {-1, 0 , 0, 1};
    public static int[] dy = {0, -1 , 1, 0};

    public static int n, m;
    public static int[][] a = new int[100][100];

    public static void loang(int i, int j) {
        a[i][j] = 0;
        for(int k = 0; k< 4; k++){
            int i1 = i + dx[k], j1 = j + dy[k];
            if(i1 >= 0 && i1 < n && j1 >= 0 && j1 < n && a[i1][j1] == 1){
                loang(i1, j1);
            }
        }
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
            for (int j = 0; j < m; j++) {
                if(a[i][j] ==1){
                    ++dem;
                    // cho het nhung o xung quanh chung mien thanh so 0
                    loang(i, j);
                }
            }
        }
        System.out.println(dem);

    }
}
