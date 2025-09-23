package baitap;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i = s.length()-1;i>=0;i--){
            System.out.println(s.charAt(i));
        }
        System.out.println();
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
    }
}
