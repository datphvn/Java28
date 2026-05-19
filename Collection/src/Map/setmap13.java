package Map;

import java.util.*;
import java.util.TreeSet;

public class setmap13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        TreeSet<Integer> tree1 = new TreeSet<>();
        TreeSet<Integer> tree2 = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            tree1.add(sc.nextInt());

        }

        for (int i = 0; i < m; i++) {
            tree2.add(sc.nextInt());
        }

        tree1.removeAll(tree2);
        for (Integer integer : tree1) {
            System.out.println(integer + " ");
        }
    }
}
