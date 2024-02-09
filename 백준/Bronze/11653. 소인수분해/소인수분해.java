import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        while(n > 1){
            for(int i = 2; i<=n; i++){
                if(n%i == 0){
                    n /= i;
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}