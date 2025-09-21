package comparator;

import java.util.*;
import java.util.Scanner;

public class cmpBai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer>[] a = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            a[i] = new ArrayList<>(); //cap phat dong cho a[i]
            a[i].add(sc.nextInt());
            a[i].add(sc.nextInt());
            a[i].add(sc.nextInt());
        }
        Arrays.sort(a, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                for (int i = 0; i < 3; i++) {
                    if (o1.get(i) != o2.get(i)) {
                        return o1.get(i) - o2.get(i);
                    }
                }
                return 0;
            }
        });
        for(ArrayList<Integer> p : a) {
            System.out.println(p.get(0) + " " + p.get(1) + " " + p.get(2));
        }
    }

}
