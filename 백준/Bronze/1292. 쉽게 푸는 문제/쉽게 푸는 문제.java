import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        int sum = 0;
        
        for(int i=1; i<=b; i++){
            for(int j=1; j<=i; j++){
                count++;
                if(count >= a && count <= b){
                    sum += i;
                }
            }
        }
        System.out.println(sum);
    }
}