package A2OJ;

import java.util.Scanner;

public class ThenumberofPositions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(Math.min(n-a,b+1));
    }
}
