package Map;

import java.util.*;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        // Map.Entry<Integer< Integer>
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(1, 2);
        map.put(2, 3);
        map.put(2, 4);
        map.put(3, 5);
        map.put(4, 6);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
