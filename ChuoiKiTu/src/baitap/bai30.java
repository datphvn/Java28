package baitap;

import java.util.Scanner;

public class bai30 {
    //sau hoan vi Permutation
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int[] cnt = new int[256];
        for(char x : s.toCharArray()) {
            cnt[(int)x]++;
        }
        for(char x : t.toCharArray()) {
            cnt[(int)x]--;
        }
        for(int i = 0; i <256; i++) {
            if(cnt[i] != 0) {
                System.out.println("29tech");
                return;
            }
            else{
                System.out.println("28tech");
            }

        }
    }
}
