package A2OJ;

import java.util.Scanner;

public class JzzhuandChildren {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int max = 0;
        int k = 0;
        for(int i=0; i<n; i++) {
            int can = scan.nextInt();
            if(Math.ceil((double) can/m) >= max){
                max = (int)Math.ceil((double) can/m);
                k = i;
            }
        }
        System.out.println(k+1);
    }
}
