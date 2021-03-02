
import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int vec_X = 0;
        int vec_Y = 0;
        int vec_Z = 0;

        for(int i=0; i<n; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = scan.nextInt();
            vec_X = vec_X + x;
            vec_Y = vec_Y + y;
            vec_Z = vec_Z + z;
        }


        if(vec_X==0 && vec_Y==0 && vec_Z ==0) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
