package A2OJ;

import java.util.Scanner;

public class Drink {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] driks = new int[n];
        int total = 0;
        for(int i=0; i<n; i++) {
            driks[i] = scan.nextInt();
            total = total + driks[i];
        }
        double avg = (double)total/(double) n;
        System.out.println(avg);
    }
}
