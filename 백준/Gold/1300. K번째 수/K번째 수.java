import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long lo = 1;
		long hi = k;
        
		while(lo < hi) {
			
			long mid = (lo + hi) / 2;
			long count = 0;
			
			for(int i = 1; i <= n; i++) {
				count += Math.min(mid / i, n);
			}
			
			if(k <= count) {
				hi = mid;
			}
			else {
				lo = mid + 1;
			}
		}
		
		System.out.println(lo);
	}
}