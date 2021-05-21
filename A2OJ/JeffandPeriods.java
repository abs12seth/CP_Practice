package A2OJ;

import java.util.*;

class Numbers{

    int a;
    int b;
    public Numbers(int a, int b){
        this.a = a;
        this.b = b;
    }

    public String toString(){
        return this.a+" "+this.b;
    }

}

class Sortbya implements Comparator<Numbers>{
    public int compare(Numbers x, Numbers y){
        return x.a - y.a;
    }
}

public class JeffandPeriods {
    public static void main(String[] rgs) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = 0;
        int prev = 0;
        int nxt = 0;
        int crr = 0;
        List<Numbers> num = new ArrayList<Numbers>();
        List<Integer> dis = new ArrayList<>();
        List<Integer> times = new ArrayList<>();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        for (int i=0; i<n; i++){
            if(!checkNum(dis,arr[i])){
                dis.add(arr[i]);
                prev = 0;
                for(int j=i+1; j<n; j++){
                    if(arr[j] == arr[i]){
                        int diff = j-i;
                        num.add(new Numbers(arr[i],j-i));
                        times.add(j-i);
                        prev = prev + 1;
                        break;
                    }
                }
                if(prev == 0){
                    num.add(new Numbers(arr[i],0));
                }

                k++;
            }
        }
        Collections.sort(num,new Sortbya());
        System.out.println(k);
        for (int i=0; i<num.size(); i++){
            System.out.println(num.get(i));
        }

    }

    public static boolean checkNum(List<Integer> dis,int num){
        for (int i=0; i< dis.size(); i++){
            if(dis.get(i) == num){
                return true;
            }
        }
        return false;
    }

}
