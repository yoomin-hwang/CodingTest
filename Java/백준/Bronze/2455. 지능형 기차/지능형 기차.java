import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int max = 0;
        for(int i=0; i<4; i++){
            int out = sc.nextInt();
            int in = sc.nextInt();
            count -= out;
            if(count + in > 10000) count = 10000;
            else count += in;
            if(max < count) max = count;
        }
        System.out.println(max);
        sc.close();
    }
}