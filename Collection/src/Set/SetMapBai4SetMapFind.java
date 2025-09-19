package Set;

import java.util.HashSet;
import java.util.Scanner;

public class SetMapBai4SetMapFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < m; i++) {
            set.add(sc.nextInt());


        }
        for(int x : arr){
            if(set.contains(x)){
                System.out.println("28tech");
            }
            else{
                System.out.println("29tech");
            }
        }
    }
}
