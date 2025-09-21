package comparator;

import java.util.*;
import java.util.Scanner;

public class cmpBai10  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer>[] a = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            a[i] = new ArrayList<>(); //cap phat dong cho a[i]
            a[i].add(sc.nextInt());
            a[i].add(sc.nextInt());
        }
        Arrays.sort(a, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                if(Math.abs(o1.get(0) - o1.get(1)) != Math.abs(o2.get(0) - o2.get(1))){
                    return Math.abs(o1.get(0) - o1.get(1)) - Math.abs(o2.get(0) - o2.get(1));
                }
                if(o1.get(0) != o2.get(0)){
                    return o1.get(0) - o2.get(0);
                }
                return o2.get(1) - o1.get(1);
            }
        });
        for(ArrayList<Integer> p : a) {
            System.out.println(p.get(0) + " " + p.get(1));
        }
    }

}
