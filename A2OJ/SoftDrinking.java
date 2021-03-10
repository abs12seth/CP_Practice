package A2OJ;

import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int l = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int p = scan.nextInt();
        int nl = scan.nextInt();
        int np = scan.nextInt();

        int toasts = (k*l)/nl;
        int limes = c*d;
        int salt = p/np;
        int nim = Math.min(Math.min(limes,salt),toasts);

        System.out.println(nim/n);


    }
}
