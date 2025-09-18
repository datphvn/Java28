import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(5);
        System.out.println(list.contains(3));
        System.out.println(list.contains(2));
        list.set(3, 100);
        for(int x : list){
            System.out.println(x);
        }
        System.out.println(list.indexOf(3));
        System.out.println(list.indexOf(13));
        list.remove((Object)5);
        for(int x : list){
            System.out.println(x + " ");
        }
    }
}
