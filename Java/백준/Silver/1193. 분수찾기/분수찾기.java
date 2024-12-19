import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int asc = 0;
        int des = 0;
        int count = 0;
        int n = 0;
        
        while(count < x){
            n++;
            asc = 1;
            des = n;
            for(int i=1; i<=n; i++){
                if(i != 1){
                    asc++;
                    des--;
                }
                count++;
                if(count == x) break;
            }
        }
        if(n % 2 == 0)
            System.out.println(asc + "/" + des);
        else
            System.out.println(des + "/" + asc);
        
        /*
        for(int i=2; i<=x; i++){
            for(int j=1; j<=i; j++){
                if(i%2 == 0){
                    num = j;
                    den = i-j;
                }
                else{
                    num = i-j+1;
                    den = j;
                }
            }
        }
        System.out.println(num + "/" + den);
        */
        
        sc.close();
    }
}