package A2OJ;

import java.util.Arrays;
import java.util.Scanner;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String guest = scan.nextLine();
        String host = scan.nextLine();
        String pile = scan.nextLine();
        char[] p = pile.toCharArray();
        if((guest.length() + host.length()) != pile.length()){
            System.out.println("NO");
        }
        else {
            String comb = guest+host;
            char[] chs = comb.toCharArray();
            Arrays.sort(chs);
            Arrays.sort(p);
            if(String.valueOf(chs).equals(String.valueOf(p))){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
