import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        // int[] order = new int[n];
        // int[] reorder = new int[n];
        
        for(int i=0; i<n; i++)
            a[i] = s.nextInt();
        for(int i=0; i<n; i++){
            b[i] = s.nextInt();
            // order[i] = i;
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        /*
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(b[i] > b[j]){
                    order[i] = j;
                    order[j] = i;
                }
            }
        }
        for(int i=0; i<n; i++){
            reorder[order[i]] = a[i];
        }
        */
        
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += a[i]*b[n-1-i];
        }
        System.out.println(sum);
    }
}