package A2OJ;

import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if(s.contains("--")) {
            while (s.contains("--")) {
                s = s.replace("--", "2");
            }
        }

        if(s.contains("-.")) {
            while (s.contains("-.")) {
                s = s.replace("-.", "1");
            }
        }

        if(s.contains(".")) {
            while (s.contains(".")) {
                s = s.replace(".", "0");
            }
        }



        System.out.println(s);

    }
}
