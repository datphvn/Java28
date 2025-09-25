package baitap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class bai33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("\\s+ ");
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for(String x : arr){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }
            else{
                map.put(x,1);
            }
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
