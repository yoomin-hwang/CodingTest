import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] digit = new int[10];
        int count = 0;
        while(n > 0){
            digit[n%10]++;
            n /= 10;
        }
        digit[6] = (digit[6] + digit[9] + 1) / 2;
        digit[9] = 0;
        int max = 0;
        for(int i=0; i<10; i++){
            if(max < digit[i]) max = digit[i];
        }
        System.out.println(max);
    }
}