package A2OJ;

import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        int yr = 0;

        for(int i = year+1; i<9013; i++) {
            int[] count = {0,0,0,0,0,0,0,0,0,0};
            int k = i;
            int c = 0;
            while(k!=0) {
                int a = k%10;
                count[a]++;
                k = k/10;
            }
            for(int j=0; j<10; j++) {
                if(count[j]==1){
                    c++;
                }
            }
            if(c==4){
                yr = i;
                break;
            }
        }
        System.out.println(yr);
    }
}
