import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int k = sc.nextInt();
            int n = (int)Math.pow(2, k) - 1;
            System.out.println(n);
        }
    }
}