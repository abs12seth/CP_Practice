package A2OJ;

import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sha = scan.nextLine();
        String con = scan.nextLine();
        String res = "";

        for(int i=0; i<sha.length(); i++) {
            if(sha.charAt(i) == con.charAt(i)) {
                res = res + "0";
            }
            else{
                res = res + "1";
            }
        }

        System.out.println(res);

    }
}
