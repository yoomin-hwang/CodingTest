import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int sum = 0;
        for(int i=0; i<5; i++){
            int num = s.nextInt();
            sum += Math.pow(num, 2);
        }
        System.out.println(sum%10);
    }
}