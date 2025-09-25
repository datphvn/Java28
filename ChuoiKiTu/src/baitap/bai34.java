package baitap;

import java.util.*;

public class bai34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";

        TreeMap<String, Integer> map = new TreeMap<>();

        while (sc.hasNextLine()) {
            s = sc.nextLine();
            if(map.containsKey(s)) {
                map.put(s,map.get(s)+1);
            }
            else {
                map.put(s,1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
