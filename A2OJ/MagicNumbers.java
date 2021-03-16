package A2OJ;

import java.util.Scanner;

public class MagicNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String s2 = "";
        if(s.contains("144")){
            s = s.replace("144",".");
        }
        if(s.contains("14")){
            s = s.replace("14",".");
        }
        if(s.contains("1")){
            s = s.replace("1",".");
        }
        for (int i=0;i<s.length(); i++) {
            s2 = s2 + ".";
        }
        if(s.equals(s2)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        //System.out.println(s);
    }
}
