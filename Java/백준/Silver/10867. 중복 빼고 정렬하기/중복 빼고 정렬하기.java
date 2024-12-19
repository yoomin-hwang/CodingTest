import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i=0; i<n; i++){
            hashSet.add(sc.nextInt());
        }

        ArrayList<Integer> arrayList = new ArrayList<>(hashSet);
        Collections.sort(arrayList);
        
        StringBuilder sb = new StringBuilder();
        for (int i : arrayList){
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString());
    }
}