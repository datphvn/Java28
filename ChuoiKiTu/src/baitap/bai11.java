package baitap;

import java.util.Scanner;

public class bai11 {
    //chuan hoa ten
    public static String convert(String s){
        String[] arr = s.split("\\s+ ");
        String name = "";
        for(String x : arr){
            name += Character.toUpperCase(x.charAt(0));
            for(int i = 1; i < x.length(); i++){
                name += Character.toLowerCase(x.charAt(i));
            }
            name += " ";
        }
        return name.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(convert(s));
    }
}
