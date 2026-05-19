package Map;

import java.util.*;
import java.util.TreeSet;

public class setmap12 {
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

        TreeSet<Integer> combined = new TreeSet<>();
        combined.addAll(tree1);
        combined.addAll(tree2);

        TreeSet<Integer> common =  new TreeSet<>(tree1);

        common.retainAll(tree2);

        combined.removeAll(common);
        for (Integer integer : combined){
            System.out.println(integer + " ");
        }
    }
}
