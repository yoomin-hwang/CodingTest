import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];    // cost
        int min = 0;
        for(int i=0; i<n; i++){
            v[i] = sc.nextInt();
            min += v[i];
        }
        for(int i=0; i<n; i++){
            int cost = 0;
            for(int j=0; j<n-1; j++){
                int index = i + j;
                if(index >= n) index = i+j-n;
                cost += v[index];
            }
            if(min > cost) min = cost;
        }
        System.out.println(min);
        sc.close();
    }
}