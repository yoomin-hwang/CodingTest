import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int[] scores = new int[n];
            double avg = 0.0;
            double ratio = 0.0;
            for(int j=0; j<n; j++){
                scores[j] = sc.nextInt();
                avg += scores[j];
            }
            avg /= n;
            for(int j=0; j<n; j++){
                if(scores[j] > avg) ratio++;
            }
            ratio /= n;
            ratio *= 100;
            System.out.println(String.format("%.3f%%", ratio));
        }
        sc.close();
    }
}