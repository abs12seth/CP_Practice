package A2OJ;

import java.util.Scanner;

public class LittleelephantandRozdil {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int min = 1000000001;
        int count = 0;
        int j = 0;
        for(int i=0; i<n; i++){
            int k = scn.nextInt();
            if(k<min) {
                min = k;
                j = i+1;
                count = 0;

            }
            if(k==min){
                count++;
            }
        }
        if(count == 1){
            System.out.println(j);
        }
        else{
            System.out.println("Still Rozdil");
        }
    }
}
