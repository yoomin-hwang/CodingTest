import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int times = n*m - 1;
        System.out.println(times);
    }
}