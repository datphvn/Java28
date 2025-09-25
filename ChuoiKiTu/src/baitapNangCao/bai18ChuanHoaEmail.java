package baitapNangCao;

import java.util.Scanner;

public class bai18ChuanHoaEmail {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = Integer.parseInt(sc.nextLine());
          for(int i = 0; i < n; i++){
              String[] arr = sc.nextLine().toLowerCase().split("\\s+");
              String email = arr[arr.length - 2];
              for(int j = 0; j < arr.length - 2; j++){
                  email += arr[j].charAt(0);
              }
              System.out.println(email + "@xyz.edu.vn");
              String ngaySing = arr[arr.length - 1];
              String[] b = ngaySing.split("/");
              for(String x : b){
                  System.out.print(Integer.parseInt(x));
              }
              System.out.println();
          }
    }
}
