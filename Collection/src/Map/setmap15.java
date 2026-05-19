package Map;

import java.util.*;

public class setmap15 {

    public static int firstIndexGreaterThanValue(ArrayList<Integer> arrayList, int value){
        int left = 0;
        int right = arrayList.size()-1;
        int result = -1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arrayList.get(mid) > value){
                result = arrayList.get(mid);
                right = mid-1;

            }
            else {
                left = mid + 1;
            }
        }
        return result;
    }

    public static int lastIndexSmallerThanValue(ArrayList<Integer> arrayList, int value){
        int left = 0;
        int right = arrayList.size()-1;
        int result = -1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arrayList.get(mid) > value){
                result = arrayList.get(mid);
                left = mid+1;

            }
            else {
                right = mid - 1;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());

        }

        int querry = sc.nextInt();
        for (int i = 1; i <= querry; i++) {
            int operator = sc.nextInt();
            if (operator == 1) {
                int value = sc.nextInt();
                arr.add(value);

            }
            else if (operator == 2) {
                int value = sc.nextInt();
                if(arr.contains(value)){
                    arr.remove((Integer) value);
                }
            }
            else if (operator == 3) {
                int value = sc.nextInt();
                Collections.sort(arr);
                System.out.println(firstIndexGreaterThanValue(arr,value));
            }
            else if  (operator == 4) {
                int value = sc.nextInt();
                Collections.sort(arr);
                System.out.println(lastIndexSmallerThanValue(arr,value));
            }
        }
    }
}
