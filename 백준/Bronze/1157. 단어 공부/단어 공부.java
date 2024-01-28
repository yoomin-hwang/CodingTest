import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        word = word.toUpperCase();
        
        int[] alpha = new int[26];
        for(int i=0; i<word.length(); i++){
            alpha[word.charAt(i)-'A']++;
        }
        
        int maxi = 0;
        int flag = 0;
        for(int i=1; i<26; i++){
            if(alpha[maxi] < alpha[i]){
                maxi = i;
                flag = 0;
            }
            else if(alpha[maxi] == alpha[i]) flag = i;
        }
        if(alpha[maxi] == alpha[flag] && flag != 0) System.out.println("?");
        else System.out.println((char)('A'+maxi));
    }
}