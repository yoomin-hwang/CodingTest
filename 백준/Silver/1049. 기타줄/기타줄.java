import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[m];
        int[] s = new int[m];
        int minp = 0;
        int mins = 0;
        int price = 0;
        for(int i=0; i<m; i++){
            p[i] = sc.nextInt();
            s[i] = sc.nextInt();
            
            if(p[minp] > p[i]) minp = i;
            if(s[mins] > s[i]) mins = i;
        }
        if(s[mins] * 6 < p[minp]) price = s[mins] * n;
        else{
            price = (n%6) * s[mins] + (n/6) * p[minp];
            if((n/6 + 1) * p[minp] < price) price = (n/6 + 1) * p[minp];
        }
        System.out.println(price);
    }
}