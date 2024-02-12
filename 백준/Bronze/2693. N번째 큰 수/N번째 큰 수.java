import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int[] a = new int[10];
            for(int j=0; j<10; j++){
                a[j] = sc.nextInt();
            }
            Arrays.sort(a);
            System.out.println(a[a.length-3]);
        }
        sc.close();
    }
}