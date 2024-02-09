import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if(n < 100) count = n;
        else{
            count = 99;
            for(int i=100; i<=n; i++){
                if(i/100 - (i/10)%10 == (i/10)%10 - i%10)
                    count++;
            }
        }
        System.out.println(count);
    }
}