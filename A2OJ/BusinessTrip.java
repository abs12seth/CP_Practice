package A2OJ;

import java.util.Arrays;
import java.util.Scanner;

public class BusinessTrip {
    public static void main(String[] rgs) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int n = 12;
        int[] mnt = new int[n];
        for(int i=0; i<n; i++) {
            mnt[i] = scan.nextInt();
        }
        Arrays.sort(mnt);
        int sum = 0;
        int i=n-1;
        int count=0;
        while(sum<k){
            if(i<0){
                break;
            }
            sum = sum + mnt[i];
            i--;
            count++;
            //System.out.println(count+" "+sum);
        }
        if(sum>=k)
            System.out.println(count);
        else{
            System.out.println("-1");
        }
    }
}
