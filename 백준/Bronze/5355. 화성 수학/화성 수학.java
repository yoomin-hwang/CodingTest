import java.util.Scanner;
import java.lang.Double;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        
        for(int i=0; i<t; i++){
            String[] arr = s.nextLine().split(" ");
            double num = Double.parseDouble(arr[0]);
            for(int j=1; j<arr.length; j++){
                switch(arr[j]){
                    case "@":
                        num *= 3;
                        break;
                    case "%":
                        num += 5;
                        break;
                    case "#":
                        num -= 7;
                        break;
                    default:
                        continue;
                }
            }
            System.out.println(String.format("%.2f", num));
        }
        s.close();
    }
}