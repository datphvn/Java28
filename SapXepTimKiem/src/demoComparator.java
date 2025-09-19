import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class demoComparator {

    // < 0 : khi o1 < o2
    // = 0 : khi o1 = o2
    // > 0 khi o1 > o2

    //bước 1 : xác định thứ tự mà mình muốn sắp xếp mảng : tăng dần, giảm dần, theo tổng chữ số tăng dần ..
    //bước 2 : nghĩa ra cái điều kiê để o1 sẽ được đứng trước o2 sau khi mảng sắp xếp xong
    //bước 3 : Kiểm tra điều kiện đó thỏa mãn thì trả -1, không thỏa mã trả về 1

    public static int tong(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] a = {10000001, 1, 1000003, 3001, 4000, 6003, 9000, 1008, 20002, 202};


        //anonymous

        Arrays.sort(a, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return tong(o2) - tong(o1);
            }
        });
        for (int x : a) System.out.print(x + " ");
    }
}