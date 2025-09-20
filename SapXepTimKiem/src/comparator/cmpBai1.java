package comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class cmpBai1 {

    public static int chan(int n){
        if(n == 0){
            return 1;
        }
        int ans = 0;
        while (n !=0){
            if(n%2 == 0){
                ++ans;
            }
            n = n/10;
        }
        return ans;
    }

    public static int le(int n){
        if(n == 0){
            return 1;
        }
        int ans = 0;
        while (n !=0){
            if(n%2 == 1){
                ++ans;
            }
            n = n/10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = a[i];
        }
        Arrays.sort(a, new Comparator<Integer>() {

            @Override
            public int compare(Integer x, Integer y) {
                if(chan(x) != chan(y)){
                    return chan(x) - chan(y);
                }
                return x - y;
            }
        });
        for(int x : a){
            System.out.print(x + " ");
        }
        Arrays.sort(b, new Comparator<Integer>() {

            @Override
            public int compare(Integer x, Integer y) {
                return le(x) - le(y);
            }
        });
        for(int x : b){
            System.out.print(x + " ");
        }
    }
}
