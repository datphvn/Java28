package Set;

import java.util.HashSet;
import java.util.Scanner;

public class setmapbai1Phanturiengbiet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<Integer>();
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            set.add(a[i]);
        }
        System.out.println(set.size());
    }
}
