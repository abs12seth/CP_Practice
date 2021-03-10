package A2OJ;

import java.util.Scanner;

public class WaytoolongWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0; i<n; i++) {
            String s = scan.next();
            if(s.length()>10){
                s = s.charAt(0)+Integer.toString(s.length()-2)+s.charAt(s.length()-1);
            }
            System.out.println(s);
        }
    }
}
