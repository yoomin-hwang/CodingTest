import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String w = sc.nextLine();
        
        int size = s.length();
		int size2 = w.length();
		
		s = s.replace(w, "");
		System.out.println((size - s.length()) / size2);
    }
}