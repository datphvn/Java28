package baitap;

import java.util.HashSet;
import java.util.Scanner;

public class bai8PhuongPhapDanhDau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int[] cnt = new int[256];
        for(char x : s.toCharArray()) {
            cnt[x] = 1;
        }
        for(int i = 97; i <= 122; i++) {
            if(cnt[i] == 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
