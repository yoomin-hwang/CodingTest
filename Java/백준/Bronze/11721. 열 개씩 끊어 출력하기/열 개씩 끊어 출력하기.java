import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        int start = 0;
        
        for(int i=0; i<n/10; i++){
            System.out.println(str.substring(start, start+10));
            start += 10;
        }
        System.out.println(str.substring(n - n%10));
    }
}