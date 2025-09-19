package comparator;

import java.util.*;

public class cmpBai6 {

    public static int demle(int n){
        int sum = 0;
        while(n != 0){
            if(n%2 == 1) ++sum;
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
                if(demle(o1) != demle(o2)){
                    return demle(o2) - demle(o1);
                }
                return o1 - o2;
            }
        });
        for(int x : a){
            System.out.println(x + " ");
        }
    }
}
