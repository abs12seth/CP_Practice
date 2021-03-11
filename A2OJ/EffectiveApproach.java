package A2OJ;

import java.util.Scanner;

public class EffectiveApproach {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[10000];
        for(int i=0; i<n; i++) {
            arr[scan.nextInt()] = i;
        }
        int queries = scan.nextInt();
        long vesya = 0;
        long petya = 0;

        for(int i=0; i<queries; i++) {
            int v = 0;
            int query = scan.nextInt();
            petya = petya + arr[query] + 1;
            vesya = vesya + n - arr[query];
        }
        System.out.print(petya + " " + vesya);

    }

}
