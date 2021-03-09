package A2OJ;

import java.util.Scanner;

public class IloveUsername {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] contests = new int[n];
        int max=0,min=0;
        int count  = 0;
        for(int i=0; i<n; i++){
            contests[i] = scan.nextInt();
            if(i==0) {
                max = contests[i];
                min = contests[i];
            }
            else{
                if(contests[i]>max){
                    max = contests[i];
                    count++;
                }
                if(contests[i]<min){
                    min = contests[i];
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
