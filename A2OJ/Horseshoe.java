package A2OJ;

import java.util.Scanner;

public class Horseshoe {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] color = new int[4];
        int count = 0;

        for(int i=0; i<4; i++){
            color[i] = scan.nextInt();
        }

        for(int i=0; i<4; i++) {
            for(int j=i+1; j<4; j++) {
                if (color[i] == color[j]){
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
