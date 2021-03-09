package A2OJ;

import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int passe = 0;
        int cap = 0;
        for (int i=0; i<n; i++) {
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
            passe = passe - a[i] + b[i];
            if(passe > cap){
                cap = passe;
            }
        }

        System.out.println(cap);

    }
}
