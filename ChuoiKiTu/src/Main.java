import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //string
    //character
    //length charAt trim subString toLowerCase toUpperCase contains indexOf compareTo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "python 12345 ABCDEF";

//        System.out.println(s.length());
//        for (int i = 0; i < s.length(); i++) {
//            System.out.println(s.charAt(i));
//        }
//
//        for( char x : s.toCharArray()){
//            System.out.print(x + " ");
//        }

        System.out.println(s.indexOf("ABC"));
        System.out.println(s.contains("12345"));
        System.out.println(s.compareTo("za"));
        String t = " yyy";
        s += "yyy";
        System.out.println(s);
    }
}