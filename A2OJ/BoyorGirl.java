package A2OJ;

import java.util.Scanner;

public class BoyorGirl {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        String s = scan.nextLine();
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            for(int j=i+1; j<s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)){
                    count++;
                    break;
                }
            }
        }
        count = s.length() - count;
        if(count%2==0) {
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
}
