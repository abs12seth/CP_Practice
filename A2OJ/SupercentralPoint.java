package A2OJ;

import java.util.Scanner;

public class SupercentralPoint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int points = 0;

        for(int i=0; i<n;i++) {
            x[i] = scan.nextInt();
            y[i] = scan.nextInt();
        }

        for(int i=0; i<n; i++) {
            int r=0;
            int l = 0;
            int u = 0;
            int b = 0;
            for(int j=0; j<n; j++) {
                if(x[i] > x[j] && y[i] == y[j]){
                    r = 1;
                }
                if(x[i] < x[j] && y[i] == y[j]){
                    l = 1;
                }
                if (x[i] == x[j] && y[i] > y[j]){
                    u = 1;
                }
                if(x[i]==x[j] && y[i]<y[j]) {
                    b = 1;
                }

            }
            if(r==1 && b==1 && u==1 && l==1){
                points++;
            }
        }
        System.out.println(points);

    }
}
