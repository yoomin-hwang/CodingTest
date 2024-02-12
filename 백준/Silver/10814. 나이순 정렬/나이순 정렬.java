import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		int N = Integer.parseInt(br.readLine());
		String[][] arr = new String[N][2];
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		
		Arrays.sort(arr, new Comparator<String[]>() {
			@Override
			public int compare(String[]o1, String[]o2) {
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			}
		});
		
		for(int i = 0; i < N; i++) {
			sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
		}
		System.out.println(sb);
	}

}
/*import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.lang.Integer;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[][] arr = new String[n][2];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextLine().split(" ");
            Arrays.sort(arr, new Comparator<String[]>() {
                @Override
                public int compare(String[] s1, String[] s2){
                    return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
                }
            });
        }
        for(int i=0; i<n; i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}*/