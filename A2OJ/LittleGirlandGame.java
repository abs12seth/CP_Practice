package A2OJ;

import java.util.Scanner;

public class LittleGirlandGame {
    public static void main(String[] rgs){
        Scanner sca = new Scanner(System.in);
        String s = sca.next();
        char[] ch = s.toCharArray();
        boolean[] check = new boolean[26];
        for(int i=0; i<s.length(); i++){
            check[ch[i]-'a'] = !check[ch[i]-'a'];
        }
        int count = 0;
        for (int i=0; i<26; i++){
            if(check[i]){
                count++;
            }
        }
        if(count == 0 || count%2 == 1)
            System.out.println("First");
        else
            System.out.println("Second");

    }

}
