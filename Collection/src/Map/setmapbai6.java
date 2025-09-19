package Map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class setmapbai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> point = new ArrayList<>();
            point.add(sc.nextInt()); point.add(sc.nextInt());
            set.add(point);
        }
        System.out.println(set.size());
    }
}
