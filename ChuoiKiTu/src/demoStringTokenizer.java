import java.util.Scanner;
import java.util.StringTokenizer;

public class demoStringTokenizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "a.bc 18.21 jq.w sa.dfsadf asdfa.sdf asdfa.sdf";
        StringTokenizer st = new StringTokenizer(s, ". ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
