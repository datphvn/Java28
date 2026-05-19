package Map;

import java.util.*;
import java.util.Scanner;

public class setmap10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();

        for (int i = 0; i < n; i++){
            map.put(sc.nextInt(), 1);
        }

        for (int i = 0; i < m; i++){
            int value = sc.nextInt();
            if (map.containsKey(value)){
                map.put(value, 2);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() == 2){
                System.out.println(entry.getKey() + " ");
            }
        }
    }
}
