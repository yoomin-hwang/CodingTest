import java.util.Scanner;
import java.io.IOException;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger A = new BigInteger(s.next());
        BigInteger B = new BigInteger(s.next());
        A = A.add(B);
        System.out.println(A.toString());
    }
}