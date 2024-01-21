import java.util.Scanner;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        Main m = new Main();
        m.solution();
    }
    
    public void solution() throws IOException{
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k;
        int y = 0, m = 0;
        
        for(int i=0; i<n; i++){
            k = s.nextInt();
            y += 10*(k/30 + 1);
            m += 15*(k/60 + 1);
        }
        
        if(y > m) System.out.println("M " + m);
        else if(y < m) System.out.println("Y " + y);
        else System.out.println("Y M " + y);
    }
}