package Map;

import java.util.Scanner;
import java.util.TreeMap;

public class setmap8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        TreeMap<Integer,Integer> map = new TreeMap<>();

        for (int i = 0; i < size; i++) {
            int value = sc.nextInt();
            map.put(value,  map.getOrDefault(value, 0) + 1);

        }
        int query = sc.nextInt();
        for (int i = 0; i <= query; i++) {
            int operator = sc.nextInt();

            if(operator == 1){
                int value = sc.nextInt();
                map.put(value,map.getOrDefault(value, 0) + 1);
            }
            else if(operator == 2){
                int value = sc.nextInt();
                map.remove(value);
            }
            else if(operator == 3){
                if(!map.isEmpty()){
                    System.out.println(map.firstKey());
                }
                else{

                }
            }
            else if(operator == 4){
                if(!map.isEmpty()){
                    System.out.println(map.lastKey());
                }
            }
        }

    }
}
