package A2OJ;

import java.util.Arrays;
import java.util.Scanner;

public class Sale {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] price = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = scan.nextInt();
        }
        Arrays.sort(price);
        int earned = 0;
        for(int i=0; i<m; i++){
            if(price[i] < 0){
                earned = earned + price[i];
            }
        }
        System.out.println(Math.abs(earned));
    }
}
