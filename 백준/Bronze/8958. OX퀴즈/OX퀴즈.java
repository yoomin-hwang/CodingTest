import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<t; i++){
            String s = sc.nextLine();
            int flag = 0;    // 0: X 1: O
            int score = 0;
            int add = 0;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j) == 'O'){
                    if(flag == 1){
                        add++;
                    }
                    else
                        add = 1;
                    score += add;
                    flag = 1;
                }
                else
                    flag = 0;
            }
            System.out.println(score);
        }
    }
}