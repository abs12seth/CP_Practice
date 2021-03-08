package A2OJ;

import java.util.Scanner;

public class PerfectPermutation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n+1];
        for(int i=0; i<n+1; i++) {
            arr[i] = i+1;
        }

        for(int i=0; i<n-1; i=i+2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        if(n%2 != 0){
            System.out.println("-1");
        }
        else {
            for (int i = 0; i<n; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
