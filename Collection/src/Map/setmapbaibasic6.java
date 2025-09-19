package Map;

import java.util.*;
import java.util.Scanner;
//set map co ban bai 6
public class setmapbaibasic6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, Integer> map = new TreeMap<>();
        // gia tri cua phan tu trong mang, so lan xuat hien cua phan tu trong mang
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            map.put(s, 1);

        }
        System.out.println(map.size());
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.print(entry.getKey() + " ");
        }
    }
}
