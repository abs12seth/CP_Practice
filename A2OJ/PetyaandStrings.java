package A2OJ;

import java.util.Locale;
import java.util.Scanner;

public class PetyaandStrings {
    public static void main(String[] srgd) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        str1 = str1.toLowerCase(Locale.ROOT);
        str2 = str2.toLowerCase(Locale.ROOT);
        if(str1.compareTo(str2) < 0){
            System.out.println("-1");
        }
        if(str1.compareTo(str2) == 0){
            System.out.println("0");
        }
        if(str1.compareTo(str2) > 0){
            System.out.println("1");
        }
    }
}
