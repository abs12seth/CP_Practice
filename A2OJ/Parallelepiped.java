package A2OJ;

import java.util.Scanner;

public class Parallelepiped {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a1 = scn.nextInt();
        int a2 = scn.nextInt();
        int a3 = scn.nextInt();

        int a = (int) Math.sqrt((double) (a1*a2)/a3);
        int b = (int) Math.sqrt((double) (a1*a3)/a2);
        int c = (int) Math.sqrt((double) (a2*a3)/a1);

        int sum = (a+b+c)*4;
        System.out.println(sum);
    }
}
