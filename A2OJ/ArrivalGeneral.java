package A2OJ;

import java.util.Scanner;

public class ArrivalGeneral {
    public static void main(String[] rags) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();;
        int[] height = new int[n];
        int s =0;
        int small = 101;
        int m = 0;
        int max = 0;
        for(int i=0; i<n; i++) {
            height[i] = scan.nextInt();
            if(height[i]<=small){
                small = height[i];
                s = i;
            }
            if(height[i]>max){
                max = height[i];
                m = i;
            }
        }

        if(m>s) {
            int time = m + (n-1) - s -1;
            System.out.println(time);
        }
        else{
            int time = m + (n-1) - s;
            System.out.println(time);
        }


    }
}
