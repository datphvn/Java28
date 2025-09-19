package comparator;

import java.util.*;

public class cmpBai4 {

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

        //mang cac arraylist
        ArrayList<Integer>[]a = new ArrayList[n];
        for(int i = 0; i < n; i++){
            a[i] = new ArrayList<>();
            a[i].add(sc.nextInt());
            a[i].add(sc.nextInt());
        }
        Arrays.sort(a, new Comparator<ArrayList<Integer>>() {

            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                int k1 = o1.get(0) * o1.get(0) + o1.get(1) * o1.get(1);
                int k2 = o2.get(0) * o2.get(0) + o2.get(1) * o2.get(1);
                if(k1 != k2)
                    return k1 - k2;
                if(o1.get(0) != o2.get(0)) return o1.get(0) - o2.get(0);
                return o1.get(1) - o2.get(1);
            }
        });
        for(ArrayList<Integer> x : a){
            System.out.println(x.get(0) + " " + x.get(1));
        }
    }
}
