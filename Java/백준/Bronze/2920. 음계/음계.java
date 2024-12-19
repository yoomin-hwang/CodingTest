import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] notes = new int[8];
        int flag = 0;
        
        for(int i=0; i<8; i++){
            notes[i] = s.nextInt();
        }
        for(int i=0; i<8; i++){
            if(notes[i] == i+1) flag++;
            else if(notes[i] == 8 - i) flag--;
        }
        if(flag == 8) System.out.println("ascending");
        else if(flag == -8) System.out.println("descending");
        else System.out.println("mixed");
        
    }
}