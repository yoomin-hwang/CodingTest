import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Stack<Integer> s = new Stack<>();
        
        for(int i=0; i<k; i++){
            int n = sc.nextInt();
            if(n == 0)
                s.pop();
            else
                s.push(n);
        }
        int sum = 0;
        for(Integer i : s){
            sum += i;
        }
        System.out.println(sum);
    }
}