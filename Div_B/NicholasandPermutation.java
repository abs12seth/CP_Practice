package Contest;

import java.util.Scanner;

public class NicholasandPermutation {
    public static void main(String[] srgs) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int min = 0;
        int max = 0;
        for(int i=0; i<n; i++){
            int k = scan.nextInt();
            if(k==1){
                min = i + 1;
            }
            if(k == n){
                max = i + 1;
            }
        }

        int pos_max = Math.max(n-max, max-1);
        int pos_min = Math.max(n-min,min-1);
        System.out.println(Math.max(pos_max,pos_min));

    }
}
