import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class VectorBai11HamTraVeVector {

    public static boolean prime(int n) {
        if(n < 2) return false;
        for(int i = 2; i < (int)Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static ArrayList<Integer> primeList(ArrayList<Integer> list) {
        ArrayList<Integer> primes = new ArrayList<>();
        for(int x : list){
            if(prime(x)) primes.add(x);
        }
        return primes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            list.add(x);
        }
        for(int x : primeList(list)){
            System.out.print(x + " ");
        }
    }
}
