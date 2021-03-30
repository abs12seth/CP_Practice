package A2OJ;

import java.util.Scanner;

public class DZYLovesChessboard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        for(int i=0; i<n; i++){
            String s = scan.next();
            char[] ch = s.toCharArray();
            if(s.contains(".")){
                for (int j=0; j<m; j++) {
                    if(s.charAt(j) == '.'){
                        if(i%2==0) {
                            if (j % 2 == 0) {
                                ch[j] = 'B';
                            } else {
                                ch[j] = 'W';
                            }
                        }
                        else {
                            if (j % 2 == 0) {
                                ch[j] = 'W';
                            } else {
                                ch[j] = 'B';
                            }
                        }
                    }
                }
            }
            System.out.println(String.valueOf(ch));
        }
    }
}
