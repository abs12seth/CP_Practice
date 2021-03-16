package A2OJ;

import java.util.Scanner;

public class XeniaandRingroad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int pointer = 1;
        long time = 0;

        for(int i=0; i<m; i++) {
            int task = scan.nextInt();
            if(task<pointer){
                time = time + (n-pointer) + task;
                pointer = task;
            }
            else{
                time = time + task - pointer;
                pointer = task;
            }
        }

        System.out.println(time);
    }
}
