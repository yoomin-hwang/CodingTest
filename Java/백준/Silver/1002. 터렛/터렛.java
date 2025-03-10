import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ans = -2;
        for(int i=0; i<t; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();
            
            int distance_pow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

	    	if(x1 == x2 && y1 == y2 && r1 == r2) {
		    	ans = -1;
		    }
    		else if(distance_pow > Math.pow(r1 + r2, 2)) {
	    		ans = 0;
		    }
		    else if(distance_pow < Math.pow(r2 - r1, 2)) {
			    ans = 0;
		    }
	    	else if(distance_pow == Math.pow(r2 - r1, 2)) {
	    		ans = 1;
	    	}
	    	else if(distance_pow == Math.pow(r1 + r2, 2)) {
	    		ans = 1;
	    	}	        	
		    else {
			    ans = 2;
		    }
            System.out.println(ans);
        }
    }
}