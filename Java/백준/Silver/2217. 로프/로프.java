import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        int total = 0;
        for(int i=0; i<n; i++){
            w[i] = sc.nextInt();
        }
        Arrays.sort(w);
        int max = 0;
        
        for (int i = 0; i < n; i++) {
			max = Math.max(max, w[i] * (n - i));
		}

        System.out.println(max);
        sc.close();
    }
}