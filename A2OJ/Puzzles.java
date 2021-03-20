package A2OJ;

import java.util.Arrays;
import java.util.Scanner;

public class Puzzles {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int diff = 100000;
        int[] blocks = new int[m];
        for(int i=0; i<m; i++){
            blocks[i] = scan.nextInt();
        }
        Arrays.sort(blocks);
        for(int i=n; i<=m; i++){
            diff = Math.min(diff,Math.abs(blocks[i-1]-blocks[i-n]));
        }
        System.out.println(diff);
    }
}




// 5 7 10 10 12 22