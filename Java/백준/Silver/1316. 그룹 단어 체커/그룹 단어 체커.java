import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int count = n;
        for(int i=0; i<n; i++){
            String word = sc.nextLine();
            int[] alpha = new int[26];
            char prev = word.charAt(0);
            for(int j=1; j<word.length(); j++){
                alpha[prev - 'a']++;
                if(prev != word.charAt(j)){
                    prev = word.charAt(j);
                    if(alpha[prev - 'a'] != 0){
                        count--;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}