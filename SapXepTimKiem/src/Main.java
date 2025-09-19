import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] a = {1, 3, 2, 5, 9 ,8,5 ,7 ,6 ,10};
        ArrayList<Integer> list = new ArrayList<>();
        for(int x : a) list.add(x);
        Collections.sort(list, Collections.reverseOrder());
        for(int x : list) System.out.print(x + " ");

    }
}