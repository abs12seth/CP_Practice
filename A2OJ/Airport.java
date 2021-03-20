package A2OJ;

import java.util.Arrays;
import java.util.Scanner;

public class Airport {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pass = scan.nextInt();
        int planes = scan.nextInt();
        int[] seats = new int[planes];
        int[] sum = new int[planes];
        for(int i=0; i<planes; i++) {
            seats[i] = scan.nextInt();
            sum[i] = seats[i];
        }
        int j = 0;
        int min = 0;
        Arrays.sort(seats);
        for (int i=0;i<pass;i++){
            min = min + seats[j];
            seats[j] = seats[j] - 1;
            if(seats[j]==0){
                j++;
            }
        }
        Arrays.sort(sum);
        int max = 0;
        while(pass > 0){

            int valor = sum[planes-1];

            for (int i = planes-1; i>=0; i--){

                if(sum[i] == valor){
                    max+= sum[i];
                    pass--;
                    sum[i]--;
                }
                else{
                    i = planes;
                    valor = sum[planes-1];
                }

                if(pass == 0)
                    break;
            }
        }
        System.out.println(max+" "+min);
    }
}
