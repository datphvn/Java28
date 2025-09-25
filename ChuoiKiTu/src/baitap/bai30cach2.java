package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class bai30cach2 {
    //sau hoan vi Permutation
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]){
                System.out.println("29tech");
                return;
            }
            else {
                System.out.println("28tech");
            }
        }

    }
}
