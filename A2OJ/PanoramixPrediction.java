package A2OJ;

import java.util.Scanner;

public class PanoramixPrediction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        boolean isPrime = false;
        int k = n;

        while(!isPrime){
            int div = 0;
            k++;
            for(int i=2; i<=k/2; ++i) {
                if(k%i == 0){
                    div++;
                }
            }
            if(div==0){
                isPrime=true;
            }

        }

        if(m==k){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
