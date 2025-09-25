import java.util.Scanner;

public class demoStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Nguyen van NAm";
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(1, '@');
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb.toString());
    }
}
