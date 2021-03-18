package A2OJ;

import java.util.Arrays;
import java.util.Scanner;

public class KString {
    public static void main(String[] rgs) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        String s = scan.next();
        String fin = "";
        int n = s.length();
        char[] ch = s.toCharArray();
        char b = 'a';
        int count =0 ;
        Arrays.sort(ch);
        for(int i=0; i<n; i++) {
            if(i%k == 0){
                b = ch[i];
            }
            if(ch[i] == b){
                count++;
            }
        }
        if(count%k==0 && count == n){
            for(int i=0;i<k; i++){
                for(int j=0; j<n;j = j+k){
                    fin = fin + ch[j];
                }
            }
            System.out.println(fin);
        }
        else{
            System.out.println("-1");
        }

    }
}
