package Map;

import java.util.*;
import java.util.Scanner;

public class setmap14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n+1];

        ArrayList<Integer> arrays = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arrays.add(sc.nextInt());
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = arrays.size() - 1; i >= 0; i--) {
            set.add(arrays.get(i));
            arr[i] = set.size();
        }

        int querry = sc.nextInt();
        while (querry-- > 0) {
            int left = sc.nextInt();
            System.out.println(arr[left]);
        }
    }
}
