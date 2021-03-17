package A2OJ;

import java.util.Scanner;

public class SystemofEquations {
    public static void main(String[] args) {
        Scanner scaan = new Scanner(System.in);
        int n = scaan.nextInt();
        int m = scaan.nextInt();
        int a = 0, b=0;
        int count = 0;
        while(a <= m && a*a <= n){
            b = n - a*a;
            if((a + b*b) == m ){
                count = count + 1;
            }
            a++;
        }
        System.out.println(count);
    }
}
