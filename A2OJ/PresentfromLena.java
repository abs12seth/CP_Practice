package A2OJ;

import java.util.Scanner;

public class PresentfromLena {
    public static void main(String[] strings) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=0;i<=n;i++){
            for(int k=n;k>=i+1;k--){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(j);
                if(i!=0) {
                    System.out.print(" ");
                }
            }
            for(int j=i;j>0;j--){
                System.out.print(j-1);
                if(j!=1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i=n-1; i>=0; i--){
            for(int k=n-1; k>=i; k--){
                System.out.print("  ");
            }
            for(int j=0; j<=i; j++){
                System.out.print(j);
                if(i!=0) {
                    System.out.print(" ");
                }
            }
            for(int j=i-1;j>=0;j--){
                System.out.print(j);
                if(j!=0){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
