package baitap;

import java.util.Scanner;

public class m2cBai18 {

    public static int[] dx = {-1,-1,-1, 0, 0, 1, 1, 1};
    public static int[] dy  = {-1,0 , 1, -1, 1, -1, 0 ,1};

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
                //check a[i][j]
                boolean check = true;
                for (int k = 0; k < 8; k++) {
                    int i1 = i + dx[k], j1 = j + dy[k];
                    if(i1 >= 0 && i1 < n && j1 >= 0 && j1 < m && a[i][j] <= a[i1][j1]){
                        check = false; break;
                    }
                }
                if(check){ ++ dem;}
            }
        }
        System.out.println(dem);
    }
}
