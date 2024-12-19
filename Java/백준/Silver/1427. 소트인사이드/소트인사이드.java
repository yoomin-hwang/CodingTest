import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] n = sc.nextLine().toCharArray();
        Arrays.sort(n);
        for(int i=n.length-1; i>=0; i--){
            System.out.print(n[i]);
        }
    }
}