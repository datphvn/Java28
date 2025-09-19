package Map;

import java.util.*;
import java.util.Scanner;
//set map co ban bai 3
public class setmapbaibasic3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Character> set = new TreeSet<>();
        // gia tri cua phan tu trong mang, so lan xuat hien cua phan tu trong mang
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            char c  = sc.next().charAt(0);
            set.add(c);

        }
        ArrayList<Character> list = new ArrayList<>(set);
        for(char x : set){
            list.add(x);
        }
        System.out.println(set.size());
        int l = list.size();
        System.out.println(list.get(l-1) + " " + list.get(0) + " " + list.get(l-2) + " " + list.get(1));
    }
}
