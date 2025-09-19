import java.util.Scanner;

public class demoBinarySearch {

    public static boolean bianarySearch(int a[], int l, int r, int x ){
        while (l <= r) {
            int m = (l+r)/2;
            if(a[m] == x)
                return true;
            else if (a[m] < x) {
                l = m + 1;
            }
            else
                r = m - 1;
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1, 2, 2, 3, 3, 4, 7 , 9, 10};
        System.out.println(bianarySearch(a, 0, a.length-1, 3));

    }
}
