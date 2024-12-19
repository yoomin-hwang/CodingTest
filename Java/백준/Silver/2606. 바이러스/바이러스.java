import java.util.Scanner;

public class Main {
    public static int[][] graph;
    public static boolean[] visited;
    public static int nodeCount = 0;
    public static int count = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nodeCount = sc.nextInt();
        int connected = sc.nextInt();

        graph = new int[nodeCount][nodeCount];
        visited = new boolean[nodeCount];

        for(int i=0; i<connected; i++) {
            int e1 = sc.nextInt() - 1;
            int e2 = sc.nextInt() - 1;
            graph[e1][e2] = 1;
            graph[e2][e1] = 1;
        }

        dfs(0);

        System.out.println(count);

    }

    public static void dfs(int node) {
        visited[node] = true;
        count++;
        for(int next=0; next<nodeCount; next++) {
            if(!visited[next] && graph[node][next] != 0) {
                dfs(next);
            }
        }
    }
}