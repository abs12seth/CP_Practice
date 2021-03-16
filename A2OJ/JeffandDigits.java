package A2OJ;

import java.util.Scanner;

public class JeffandDigits {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int five = 0;
        int zero = 0;
        for(int i=0; i<n; i++) {
            int k = scan.nextInt();
            if(k==5){
                five++;
            }
            else{
                zero++;
            }
        }

        if(zero > 0 && five < 9){
            System.out.println("0");
        }
        else if(zero == 0){
            System.out.println("-1");
        }
        else{
            five = five/9;
            for(int i=0; i<five*9; i++) {
                System.out.print("5");
            }
            for(int i=0; i<zero; i++) {
                System.out.print("0");
            }
         }

    }
}
