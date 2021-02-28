import java.util.Scanner;

public class Criminals {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int[] cities = new int[n];
        for (int i=0; i<n; i++) {
            cities[i] = scan.nextInt();
        }
        a = a - 1;
        int criminals = 0;
        if(cities[a] == 1){
            criminals++;
        }
        for (int i=1; i<n; i++) {

            if(a+i <= n-1 && a-i >= 0) {
                if(cities[a+i] == 1 && cities[a-i] == 1) {
                    criminals = criminals + 2;
                }
            }
            else if (a+i <= n-1 && a-i<0){
                if(cities[a+i]==1){
                    criminals++;
                }

            }
            else if (a+i > n-1 && a-i>=0){
                if(cities[a-i]==1){
                    criminals++;
                }
            }
        }
        System.out.println(criminals);

    }

}
