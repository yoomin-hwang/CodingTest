import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] add = new int[11];
        add[0] = 1;
        add[1] = 2;
        add[2] = 4;
        
        for(int i=3; i<11; i++){
            add[i] = add[i-1] + add[i-2] + add[i-3];
        }
        
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            System.out.println(add[n-1]);
        }
    }
}