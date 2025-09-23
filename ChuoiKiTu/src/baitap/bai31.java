package baitap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class bai31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        TreeMap<Character, Integer> map = new TreeMap<>();
        for(char x : s.toCharArray()) {
            if(map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            }
            else {
                map.put(x, 1);
            }
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
