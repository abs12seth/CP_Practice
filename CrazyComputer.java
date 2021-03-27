package Contest;

import java.util.Scanner;

public class CrazyComputer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] words = new int[n];
        int c = scan.nextInt();
        int count = 0;
        for(int i=0; i<n; i++) {
            words[i] = scan.nextInt();
            if(i>0){
                if(words[i] - words[i-1] <= c){
                    count++;
                }
                else {
                    count = 0;
                }
            }
        }
        System.out.println(count+1);
    }
}
