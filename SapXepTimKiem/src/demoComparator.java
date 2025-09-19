import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class demoComparator {

    // < 0 : khi o1 < o2
    // = 0 : khi o1 = o2
    // > 0 khi o1 > o2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] a = {1, 3, 2, 5, 9 ,8,5 ,7 ,6 ,10};
        Arrays.sort( a, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2)
                    return -1;
                else return 1;
            }
        });
        for(int x: a) System.out.print(x + " ");
    }
}