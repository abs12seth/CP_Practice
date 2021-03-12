package A2OJ;

import java.util.Scanner;

public class PetrandBook {
    public static void main(String[] ars ){

        Scanner scan = new Scanner(System.in);
        int pages = scan.nextInt();
        int day = 0;
        int[] week = new int[7];
        for(int i=0; i<7; i++) {
            week[i] = scan.nextInt();
        }
        int i=0;
        while(pages > 0) {
            if(i>6 ){
                i=0;
            }

            pages = pages - week[i];
            day++;
            //System.out.print(pages+" ");
            i++;
            if(day>7){
                day = 1;
            }
        }
        //System.out.println(day);

        System.out.println(day);



    }
}
