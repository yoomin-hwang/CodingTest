import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = new String[s.length()];
        for(int i=0; i<s.length(); i++){
            arr[i] = s.substring(i);
        }
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}