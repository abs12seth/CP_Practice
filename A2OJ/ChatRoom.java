package A2OJ;

import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String out = "";
        int k = 0;
        if(s.contains("h") && s.contains("e") && s.contains("l") && s.contains("o")) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'h'){
                    out = out + s.charAt(i);
                    k = i;
                    break;
                }
            }

            for(int i=k+1; i<s.length(); i++){
                if (s.charAt(i) == 'e'){
                    out = out + s.charAt(i);
                    k = i;
                    break;
                }
            }

            for(int i=k+1; i<s.length(); i++){
                if (s.charAt(i) == 'l'){
                    out = out + s.charAt(i);
                    k = i;
                    break;
                }
            }

            for(int i=k+1; i<s.length(); i++){
                if (s.charAt(i) == 'l'){
                    out = out + s.charAt(i);
                    k = i;
                    break;
                }
            }

            for(int i=k+1; i<s.length(); i++){
                if (s.charAt(i) == 'o'){
                    out = out + s.charAt(i);
                    k = i;
                    break;
                }
            }

        }
        if(out.equals("hello")){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
