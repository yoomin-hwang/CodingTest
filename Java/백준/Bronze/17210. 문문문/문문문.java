import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        int first = s.nextInt();        // 밀: 0 당: 1
        
        if(n > 5) System.out.println("Love is open door");
        
        else{
            for(long i=1; i<n; i++){
                if(first==0) first = 1;
                else first = 0;
                System.out.println(first);               
            }
        }
    }
}