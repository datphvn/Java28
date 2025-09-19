package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
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
        System.out.println(set.contains(1));
        set.remove(1);
        System.out.println(set.size());
        System.out.println("====================================");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(1);
        linkedHashSet.add(3);
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        linkedHashSet.add(2);


    }
}
