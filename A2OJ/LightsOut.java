package A2OJ;

import java.util.Scanner;

public class LightsOut {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[][] lights = {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
        int[][] press = new int[5][5];
        for(int i=1; i<4; i++) {
            for(int j=1; j<4; j++) {
                press[i][j] = scan.nextInt();
                if(press[i][j]%2 == 1) {
                    lights[i][j] = ~lights[i][j]+2;
                    lights[i][j+1] = ~lights[i][j+1]+2;
                    lights[i][j-1] = ~lights[i][j-1]+2;
                    lights[i+1][j] = ~lights[i+1][j]+2;
                    lights[i-1][j] = ~lights[i-1][j]+2;
                }
            }
        }

        for(int i=1; i<4; i++) {
            for(int j=1; j<4; j++) {
                System.out.print(lights[i][j]);
            }
            System.out.println();
        }


    }
}
