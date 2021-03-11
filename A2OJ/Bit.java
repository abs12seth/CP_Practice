package A2OJ;

import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        int n = scan.nextInt();
        for(int i=0; i<n; i++) {
            String operation = scan.next();
            if(operation.equals("++X")){
                ++x;
            }
            if(operation.equals("X++")) {
                x++;
            }
            if(operation.equals("X--")){
                x--;
            }
            if(operation.equals("--X")){
                --x;
            }
        }

        System.out.println(x);
    }
}
