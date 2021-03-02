package A2OJ;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        Scanner scan = new Scanner(System.in);
        int row = 0;
        int height = 0;
        for (int i = 0; i < 5; i++) {
            for(int j=0; j<5; j++) {
                arr[i][j] = scan.nextInt();
                if(arr[i][j] == 1) {
                    row = i;
                    height = j;
                }
            }
        }

        int min = Math.abs(row - 2) + Math.abs(height - 2);
        System.out.println(min);

    }
}
