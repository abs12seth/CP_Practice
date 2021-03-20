package A2OJ;

import java.util.Scanner;

public class Dragons56 {


    public static int partition(int[] input, int[] y,int beg, int end) {

        int pivot = input[end];
        int i = beg;
        int k = beg;
        int j = end;
        while(i<j) {
            if(input[i] > pivot){
                i++;
            }
            else{
                swap(input,i,k);
                swap(y,i,k);
                i++;
                k++;
            }
        }
        swap(input,k,j);
        swap(y,k,j);

        return k;
    }

    public static void quickSort(int[] input,int[] y ,int beg, int end) {
        if (beg<end) {
            int pivotIndex = partition(input,y,beg,end);
            quickSort(input,y,beg,pivotIndex-1);
            quickSort(input,y,pivotIndex+1,end);
        }
    }
    public static void swap(int[] array, int i, int j) {
        if(i==j)
            return;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int n = scan.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i=0; i<n; i++) {
            x[i] = scan.nextInt();
            y[i] = scan.nextInt();

        }
        quickSort(x,y,0,n-1);
        for(int i=0;i<n;i++){
            if(s>x[i]){
                s = s + y[i];
            }
            else{
                s=0;
                System.out.println("NO");
                break;
            }
        }


        if(s>0){
            System.out.println("YES");
        }
    }
}
