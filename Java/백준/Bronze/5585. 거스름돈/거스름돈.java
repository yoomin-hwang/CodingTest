import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cost = sc.nextInt();
        int remain = 1000 - cost;
        int count = 0;
        int[] coin = {500, 100, 50, 10, 5, 1};
        for(int i=0; i<6; i++){
            count += remain/coin[i];
            remain = remain - (remain/coin[i])*coin[i];
        }
        System.out.println(count);
    }
}