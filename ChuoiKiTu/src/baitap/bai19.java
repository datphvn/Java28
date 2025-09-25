package baitap;

import java.util.*;

public class bai19 {
    //dem so luong tu khac nhau
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        String[] arr = s.split("\\s+");
        HashSet<String> set = new HashSet<>();
        for(String x : arr){
            set.add(x);
        }
        System.out.println(set.size());
    }
}
