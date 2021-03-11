package A2OJ;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int prob_count = 0;
        for(int i=0; i<n; i++) {
            int count_status = 0;
            for(int j=0; j<3; j++) {
                int stat = scan.nextInt();
                if(stat == 1){
                    count_status = count_status + 1;
                }
            }
            if(count_status >= 2){
                prob_count = prob_count + 1;
            }
        }
        System.out.println(prob_count);
    }
}
