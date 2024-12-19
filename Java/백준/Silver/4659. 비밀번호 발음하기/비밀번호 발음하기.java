import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String vowel = "aeiou";
        
        while(true){
            String pw = sc.nextLine();
            if(pw.equals("end")) break;
            int count = 3;
            int vflag = 0;
            int cflag = 1;
            int sflag = 1;
            char prev = '-';
            
            for(int i=0; i<pw.length(); i++){
                if(vowel.indexOf(pw.charAt(i)) != -1){
                    vflag = 1;
                    if(vowel.indexOf(prev) != -1){
                        count--;
                        if(count == 0){
                            cflag = 0;
                            break;
                        }
                    }
                    else{
                        count = 2;
                    }
                }
                else{
                    if(vowel.indexOf(prev) == -1){
                        count--;
                        if(count == 0){
                            cflag = 0;
                            break;
                        }
                    }
                    else{
                        count = 2;
                    }
                }
                if(prev == pw.charAt(i)){
                    if(prev == 'e' || prev == 'o') continue;
                    else{
                        sflag = 0;
                        break;
                    }
                }
                prev = pw.charAt(i);
            }
            System.out.print("<" + pw + ">");
            if(vflag * cflag * sflag == 0) System.out.println(" is not acceptable.");
            else System.out.println(" is acceptable.");
        }
    }
}