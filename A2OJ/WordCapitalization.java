package A2OJ;

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char[] sr = s.toCharArray();
        char ch = sr[0];
        if((int)s.charAt(0) >= 97 && (int)s.charAt(0)<=122) {
            int k = (int) ch - 32;
            ch = (char) k;
            sr[0] = ch;
        }
        System.out.println(String.valueOf(sr));
    }
}
