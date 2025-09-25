import java.util.*;

public class demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"python", "ho c lap tring", "java", "php oop", "tim"};
        Arrays.sort(arr, Collections.reverseOrder());
        for(String x : arr){
            System.out.println(x);
        }

    }
}
