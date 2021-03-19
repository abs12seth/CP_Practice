package A2OJ;

import java.util.Locale;
import java.util.Scanner;

public class StringTask {
    public static void main(String[] main){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String out = "";
        s = s.toLowerCase(Locale.ROOT);
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u' && s.charAt(i) != 'y'){
                out = out + "." +s.charAt(i) ;
            }
        }
        System.out.println(out);
    }
}
