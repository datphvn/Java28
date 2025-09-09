import java.util.Scanner;

public class MangDanhDau1DemTanSuat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cnt = new int[1000001]; //10^6 + 1 : 0 => 10^6 ban dau co gia tri tat ca la gia tri 0

        int n = sc.nextInt();

        int[] a = new int[n];
        for(int i = 0; i< n; i++){
            a[i] = sc.nextInt();
        }
        // 3 7 8 1 2 3 1 3
        //cnt[3] = 1
        for(int x : a){
            cnt[x]++;
        }
        int dem = 0;
        for(int val = 0; val <= 1000000; val++){
            if(cnt[val] == 1){
                ++dem;
            }
        }
        System.out.println(dem);
    }
}
