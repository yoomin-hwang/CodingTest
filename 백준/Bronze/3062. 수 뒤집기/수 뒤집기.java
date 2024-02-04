import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int temp = n;
            int reverse = 0;
            
            while(temp > 0){
                reverse = reverse*10 + temp%10;
                temp /= 10;
            }
            n += reverse;
            
            int flag = 0;
            String s = "";
            
            while(n > 0){
                int c = n%10 +'0';
                s += (char) c;
                n /= 10;
            }
            
            for(int j=0; j<=s.length()/2; j++){
                if(s.charAt(j) != s.charAt(s.length() - j - 1)){
                    flag = 1;
                    break;
                }
            }
            if(flag == 1)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
        sc.close();
    }
}