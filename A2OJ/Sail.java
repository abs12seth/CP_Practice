package A2OJ;

import java.util.Scanner;

public class Sail {
    public static void main(String[] rgs){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int sx = scan.nextInt();
        int sy = scan.nextInt();
        int ex = scan.nextInt();
        int ey = scan.nextInt();
        String s = scan.next();
        boolean reached = false;
        for (int i=0; i<t; i++){
            if(s.charAt(i) == 'N'){
                if(sy < ey){
                    sy = sy + 1;
                }
            }
            if(s.charAt(i) == 'S'){
                if(sy > ey){
                    sy = sy - 1;
                }
            }
            if(s.charAt(i) == 'E'){
                if(sx < ex){
                    sx = sx + 1;
                }
            }
            if(s.charAt(i) == 'W'){
                if(sx > ex){
                    sx = sx - 1;
                }
            }
            if(sx == ex && sy == ey){
                reached = true;
                System.out.println(i+1);
                break;
            }
        }
        if(reached == false){
            System.out.println("-1");
        }
    }
}
