package A2OJ;

import java.util.Locale;
import java.util.Scanner;

public class Words {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int upper = 0;
        int lower = 0;
        for(int i=0; i<s.length(); i++) {
            if((int)s.charAt(i) <= 90 && (int)s.charAt(i)>=65){
                upper++;
            }
            if((int)s.charAt(i) >= 97 && (int)s.charAt(i)<=122) {
                lower++;
            }
        }
        if(upper>lower){
            s = s.toUpperCase(Locale.ROOT);
        }
        else{
            s = s.toLowerCase(Locale.ROOT);
        }

        System.out.println(s);

    }

}
