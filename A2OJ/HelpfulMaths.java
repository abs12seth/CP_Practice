package A2OJ;

import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char[] chs = s.toCharArray();
        for(int i=0; i<s.length()-1; i=i+2){
            for(int j=0; j<s.length() - i - 2; j=j+2){
                if(chs[j]>chs[j+2]){
                    char temp = chs[j];
                    chs[j] = chs[j+2];
                    chs[j+2] = temp;
                }
            }
        }
        System.out.println(String.valueOf(chs));
    }
}
