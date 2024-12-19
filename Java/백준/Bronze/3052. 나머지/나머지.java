import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] remain = new int[10];
        int count = 0;
        for(int i=0; i<10; i++){
            remain[i] = s.nextInt() % 42;
            for(int j=0; j<i; j++){
                if(remain[i] == remain[j]) remain[i] = -1;
            }
        }
        for(int i=0; i<10; i++){
            if(remain[i] != -1) count++;
        }
        System.out.println(count);
    }
}