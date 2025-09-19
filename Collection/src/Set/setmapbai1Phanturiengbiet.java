package Set;

import java.util.HashSet;
import java.util.Scanner;

public class setmapbai1Phanturiengbiet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<Integer>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            set.add(x);
            //khong can tao mang
        }
        System.out.println(set.size());
    }
}
