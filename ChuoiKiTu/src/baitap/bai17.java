package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class bai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("\\s+ ");
        Arrays.sort(arr);
        for(String x : arr){
            System.out.println(x);
        }

    }
}
