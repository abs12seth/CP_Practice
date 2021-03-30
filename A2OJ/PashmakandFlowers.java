package A2OJ;

import java.util.Scanner;

public class PashmakandFlowers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int min = 1000000001;
        int max = 0;
        long count_min = 0;
        long count_max = 0;
        for (int i=0; i<n; i++){
            int flow = scan.nextInt();
            if(flow==min){
                count_min++;
            }
            if(flow==max){
                count_max++;
            }
            if(flow<min){
                min = flow;
                count_min = 1;
            }
            if(flow>max){
                max = flow;
                count_max = 1;
            }
        }
        if(max==min){
                System.out.print(max - min + " " + (long)(n-1)*n/2);
        }
        else {
                System.out.print(max - min + " " + count_max * count_min);
        }
    }
}
