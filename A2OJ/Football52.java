package A2OJ;

import java.util.Scanner;

public class Football52 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        char ch = s.charAt(0);
        int count  = 0;
        for(int i=0; i<s.length(); i++) {
            if(ch==s.charAt(i)){
                count++;
                if(count == 7){
                    break;
                }
            }
            else{
                ch = s.charAt(i);
                count = 1;
            }
        }
        if(count >= 7) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
