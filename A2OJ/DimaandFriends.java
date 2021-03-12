package A2OJ;

import java.util.Scanner;

public class DimaandFriends {
    public static void main(String[] args) {
        Scanner scam = new Scanner(System.in);
        int n = scam.nextInt();
        int finger_sum = 0;
        int result = 0;
        for(int i=0; i<n; i++) {
            int f = scam.nextInt();
            finger_sum = finger_sum + f;
        }

        for(int i=1; i<=5; i++){
            if((finger_sum+i)%(n+1) != 1){
                result = result + 1;
            }
        }
        System.out.println(result);

    }
}
