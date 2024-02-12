import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<t; i++){
            int[] arr = new int[26];
            String s = sc.nextLine();
            int sum = 0;
            for(int j=0; j<s.length(); j++){
                arr[s.charAt(j)-'A']++;
            }
            for(int j=0; j<26; j++){
                if(arr[j] == 0){
                    sum = sum + 'A' + j;
                }
            }
            System.out.println(sum);
        }
    }
}