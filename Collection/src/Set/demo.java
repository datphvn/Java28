package Set;

import java.util.HashSet;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(3);
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(2);
        System.out.println(set.size());
        for(int x : set){
            System.out.print (x + " ");
        }
    }
}
