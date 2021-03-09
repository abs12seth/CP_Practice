package A2OJ;

import java.util.Scanner;

public class Cupboard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] li = new int[n];
        int[] ri = new int[n];
        int countlz = 0;
        int countlo = 0;
        int countrz = 0;
        int countro = 0;
        for(int i=0; i<n; i++) {
            li[i] = scan.nextInt();
            ri[i] = scan.nextInt();
            if(li[i] == 0){
                countlz++;
            }
            else if(li[i] == 1) {
                countlo++;
            }
            if(ri[i]==0) {
                countrz++;
            }
            else if(ri[i] == 1){
                countro++;
            }
        }

        int time_l;
        int time_r;
        if(countlo < countlz){
            time_l = countlo;
        }
        else{
            time_l = countlz;
        }

        if(countro < countrz){
            time_r = countro;
        }
        else{
            time_r = countrz;
        }

        System.out.println(time_l+time_r);

    }
}
