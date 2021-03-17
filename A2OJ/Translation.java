package A2OJ;

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String w = scan.nextLine();
        int n = s.length();
        int count = 0;
        for(int i=0; i<s.length();i++){

            if(w.charAt(i) != s.charAt(n-1-i)){
                System.out.println("NO");
                break;
            }
            count++;
        }
        if(count == n){
            System.out.println("YES");
        }
    }
}
