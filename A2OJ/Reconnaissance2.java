package A2OJ;

import java.util.Scanner;

public class Reconnaissance2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] heights = new int[n];
        for(int i=0; i<n; i++) {
            heights[i] = scan.nextInt();
        }
        int minimal = 1000;
        int k=0, l=0;
        for(int i=0; i<n-1; i++){

                if(Math.abs(heights[i] - heights[i+1]) < minimal){
                    minimal = Math.abs(heights[i] - heights[i+1]);
                    k = i+1;
                    l = k+1;
                }

        }
        if(Math.abs(heights[0]-heights[n-1]) < minimal) {
            k = 1;
            l = n;
        }

        System.out.print(l +" "+ k);
    }
}
