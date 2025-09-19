package Map;

import java.util.*;
import java.util.Scanner;

public class DungHashMapDeDemTanXuat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        // gia tri cua phan tu trong mang, so lan xuat hien cua phan tu trong mang
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if(map.containsKey(x)){
                map.put(x, map.get(x) + 1);
            }
            else{
                map.put(x, 1);
            }

        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
