import java.util.Scanner;
import java.lang.StringBuilder;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            int c = s.charAt(i) - 3;
            if(c < 'A') c += 26;
            sb.append((char)c);
        }
        System.out.println(sb.toString());
    }
}