import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int[] count = new int[10];
        
        int p = a*b*c;
        while(p > 0){
            count[p%10]++;
            p /= 10;
        }
        for(int i=0; i<10; i++){
            System.out.println(count[i]);
        }
    }
}