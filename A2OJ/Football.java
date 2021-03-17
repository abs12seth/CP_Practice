package A2OJ;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String team="",taem = "";
        String t1="",t2="";
        int gol = 1, gal = 1;
        for(int i=0; i<n; i++ ){
            team = scan.next();
            if(i==0){
                t1 = team;
            }
            if(i>0){
                if(t1.equals(team)){
                    gal++;
                    t1 = team;
                }
                else{
                    gol++;
                    t2 = team;
                }
            }
        }
        //System.out.println(gal+" "+gol);
        if(gol==1 && gal ==1){
            System.out.println(team);
        }

        else if(gal>=gol){
            System.out.println(t1);
        }
        else{
            System.out.println(t2);
        }

    }
}
