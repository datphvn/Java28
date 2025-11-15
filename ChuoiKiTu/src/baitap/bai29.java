package baitap;

import java.util.Scanner;

public class bai29 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = "";

        for(char x : s.toCharArray()) {
            if(Character.isAlphabetic(x)) {
                t += " ";
            }
            else {
                t += x;
            }
        }
        // System.out.println(t);
        String[] arr = t.trim().split("\\s+");
        long ans = 0;
        for(String x : arr) {
            ans += Long.parseLong(x);

        }
        System.out.println(ans);
    }
}
