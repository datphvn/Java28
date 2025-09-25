package baitap;

import java.util.Scanner;

public class bai31TheoMangDanhDau {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] cnt = new int[256];
        for(char x : s.toCharArray()){
            cnt[(int)x]++;

        }
        //a : 97 cnt[a]== cnt[97]++
        for(int i = 0; i < 256; i++){
            if(cnt[i] != 0){
                System.out.println((char)i + " " + cnt[i]);
            }
        }
        //cach nay nhanh hon dung Map
    }
}
