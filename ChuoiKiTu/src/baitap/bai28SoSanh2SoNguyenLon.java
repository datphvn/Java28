package baitap;

import java.util.Scanner;

public class bai28SoSanh2SoNguyenLon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        if(s.length() < t.length()){
            System.out.println("29tech" );

        }
        else if(s.length() > t.length()){
            System.out.println("28tech" );
        }
        else{
            if(s.compareTo(t) < 0){
                System.out.println("29tech" );
            }
            else if(s.compareTo(t) > 0){
                System.out.println("28tech" );
            }
            else{
                System.out.println("30tech" );
            }
        }
    }
}
