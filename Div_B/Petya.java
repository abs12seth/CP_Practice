import java.util.Scanner;

public class Petya {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] blocks = new int[n];
        for (int i = 0; i < n; i++) {
            blocks[i] = scan.nextInt();
        }

        int max_score = 0;
        for (int i = 0; i < n; i++) {
            int score = 1;
            int j = i;
            int k = i;

                while (j<n-1 || k>0) {
                    //System.out.println("HIi");
                    if(j<n-1) {
                        if (blocks[j] >= blocks[j + 1]) {
                            score++;
                            j++;

                        } else {
                            j = n - 1;
                        }
                    }
                    if(k>0) {
                        if (blocks[k] >= blocks[k - 1]) {
                            score++;
                            k--;

                        } else {
                            k = 0;
                        }
                    }
                }


            /*if (i > 0 && i < n-1) {
                while(k>0 && j<n-1){
                    if(blocks[j] >= blocks[j+1] || blocks[k] >= blocks[k-1]) {
                        score = score + 2;
                        j++;
                        k--;
                    }
                    else{
                        j=n-1;
                        k=0;
                    }
                }
            }

            if(i == n-1){
                while (k>0) {
                    //System.out.println("HIi");

                    if(blocks[k] >= blocks[k - 1]  ) {
                        score++;
                        k--;

                    }
                    else{
                        k = 0;
                    }
                }
            }*/

            if(score > max_score) {
                max_score = score;
            }

        }
        System.out.println(max_score);

        }

}
