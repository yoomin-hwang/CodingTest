import java.util.Scanner;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int total = 1;
        for(int i=0; i<n; i++){
            total += s.nextInt();
            total --;
        }
        
        System.out.println(total);
    }
}