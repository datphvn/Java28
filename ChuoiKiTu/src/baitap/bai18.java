package baitap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split("\\s+ ");
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String x ,String y){
                if(x.length() != y.length()){
                    return x.length() - y.length();
                }
                return x.compareTo(y);
            }
        });
        for(String x : arr){
            System.out.print(x + " ");
        }
    }
}
