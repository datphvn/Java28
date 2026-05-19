package Map;

import java.util.*;

public class setmap9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            set.add(sc.nextInt());
        }
        for(int i = 0; i < m; i++){
            set.add(sc.nextInt());
        }

        List<Integer> list = new ArrayList<>();

        Collections.sort(list, Collections.reverseOrder());

        for(int value : list){
            System.out.println(value + " ");
        }
     }
}
