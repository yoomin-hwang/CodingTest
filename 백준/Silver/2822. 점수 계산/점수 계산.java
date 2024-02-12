import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[8];
        int[] sorted = new int[8];
        int[] num = new int[5];
        int sum = 0;
        
        for(int i=0; i<8; i++){
            scores[i] = sc.nextInt();
            sorted[i] = scores[i];
        }
        Arrays.sort(sorted);
        for(int i=0; i<5; i++){
            sum += sorted[8-i-1];
            for(int j=0; j<8; j++){
                if(sorted[8-i-1] == scores[j])
                    num[i] = j+1;
            }
        }
        Arrays.sort(num);
        System.out.println(sum);
        for(int n : num){
            System.out.print(n + " ");
        }
        sc.close();
    }
}