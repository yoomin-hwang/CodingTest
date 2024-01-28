import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] count = new int[26];
        for(int i=0; i<n; i++){
            char first = sc.nextLine().charAt(0);
            count[first - 'a']++;
        }
        int flag = 0;
        for(int i=0; i<26; i++){
            if(count[i] >= 5){
                System.out.print((char)(i+'a'));
                flag = 1;
            }
        }
        if(flag == 0) System.out.println("PREDAJA");
    }
}