package A2OJ;

import java.util.Scanner;

public class HQ9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String p = scan.nextLine();
        if(p.contains("H")||p.contains("Q")||p.contains("9")){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
