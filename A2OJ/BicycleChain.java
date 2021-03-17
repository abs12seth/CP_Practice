package A2OJ;

import java.util.Scanner;

public class BicycleChain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = scan.nextInt();
        }
        int max_ratio = 0;
        int count = 0;
        int m = scan.nextInt();
        for(int i=0; i<m; i++) {
            int b = scan.nextInt();
            for(int j=0; j<n; j++) {
                if(b%a[j] == 0){
                    int ratio = b/a[j];
                    if(ratio == max_ratio){
                        count++;
                    }
                    if(ratio>max_ratio){
                        max_ratio = ratio;
                        count = 0;
                    }
                }
            }
        }
        //System.out.println(max_ratio);
        System.out.println(count+1);
    }
}
