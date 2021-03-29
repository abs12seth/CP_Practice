package Contest;

import java.util.Scanner;

public class DominoEffect {
    public static void main(String[] mgs) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String s = scn.next();
        int[] stats = new int[n];
        int k = 0;
        for(int i=0; i<n; i++) {
            stats[i] = 1;
        }
        for(int i=0; i<n; i++) {
            if(s.charAt(i) == 'L'){
                for(int j = i; j>=0; j--){
                    if(stats[j] == 0)
                        break;
                    stats[j] = 0;
                }
            }
            if(s.charAt(i) == 'R'){
                k = 0;
                for(int j=i; j<n; j++) {
                    stats[j] = 0;
                    if(s.charAt(j) == 'L') {
                        k = j;
                        break;
                    }
                }
                if(k!=0) {
                    if((k-i)%2 == 0){
                        stats[i+(k-i)/2] = 1;
                    }
                }
            }
        }
        int count  = 0;
        for (int i=0; i<n; i++) {
            if(stats[i] == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
