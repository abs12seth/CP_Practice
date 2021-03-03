package A2OJ;

import java.util.Scanner;

public class QueueAtTheSchool {

    public static String swap(String str, int i ,int j) {
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        String s = String.valueOf(ch);
        return s;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int t = scan.nextInt();
        String q = scan.next();

        for(int j=0; j<t; j++) {
            for (int i = 0; i < n-1; i++) {
                if (q.charAt(i) == 'B' && q.charAt(i+1) == 'G') {
                    q = swap(q, i, i+1);
                    i = i + 1;
                }
            }
        }
        System.out.println(q);
    }
}
