package A2OJ;

import java.util.Scanner;

public class Dubstep {
    public static void main(String[] rs){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if(s.contains("WUB")){
            s = s.replaceAll("WUB"," ");
        }
        s = s.trim();
        String[] mn = s.split(" ");
        String out = "";
        for(String k:mn){
            if(k.length()>0) {
                k = k.trim();
                out = out + k + " ";
            }
        }
        System.out.println(out.trim());
    }
}
