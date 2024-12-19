import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] scores = new int[5];
        int max = 0;
        
        for(int i=0; i<5; i++){
            for(int j=0; j<4; j++){
                scores[i] += s.nextInt();
            }
            if(scores[max] < scores[i]) max = i;
        }
        System.out.println(max+1 + " " + scores[max]);
    }
}