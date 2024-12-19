import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int feel = s.nextInt();
        double[] prob = new double[4];
        double good, bad;
        
        for(int i=0; i<4;i++){
            prob[i] = s.nextDouble();
        }
        
        if(feel == 0){
            good = prob[0];
            bad = prob[1];
        }
        else{
            good = prob[2];
            bad = prob[3];
        }
        
        for(int i=1; i<n; i++){
            double temp = good;
            good = good*prob[0] + bad*prob[2];
            bad = temp*prob[1] + bad*prob[3];
        }
        
        // good = Good(n, feel, prob);
        // bad = Bad(n, feel, prob);
        
        System.out.println((int)(good*1000) + "\n" + (int)(bad*1000));
    }
    
    /*
    public static double Good(int n, int prev, double[] prob){
        if(prev == 0){
            if(n==1) return prob[0];
            n--;
            return prob[0]*Good(n, 0, prob) + prob[1]*Good(n, 1, prob);
        }
        else{
            if(n==1) return prob[2];
            n--;
            return prob[2]*Good(n, 0, prob) + prob[3]*Good(n, 1, prob);
        }
    }
    
    public static double Bad(int n, int prev, double[] prob){
        if(prev == 0){
            if(n==1) return prob[1];
            n--;
            return prob[0]*Bad(n, 0, prob) + prob[1]*Bad(n, 1, prob);
        }
        else{
            if(n==1) return prob[3];
            n--;
            return prob[2]*Bad(n, 0, prob) + prob[3]*Bad(n, 1, prob);
        }
    }
    */
}