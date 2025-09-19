package comparator;

import java.util.*;

public class cmpBai8 {

    public static int count(int n){
        int sum = 0;
        while(n != 0){
            int r = n % 10;
            if(r == 2 || r == 3 || r == 7 || r == 5) ++ sum;
            n /= 10;
        }
        return sum;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for(int i = 0; i < n; ++i){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return count(o2) - count(o1);
            }
        });
        for(int x : a){
            System.out.println(x + " ");
        }
    }
}
