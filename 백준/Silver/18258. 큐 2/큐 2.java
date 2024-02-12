import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    static int[] queue;
    static int back, front, size;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(sc.nextLine());

        queue = new int[N];
        back = 0;
        front = 0;
        size = 0;

        while(N --> 0){
            st = new StringTokenizer(sc.nextLine());
            String order = st.nextToken();

            if(order.contains("front")){
                sb.append(front()).append("\n");
            }
            else if(order.contains("back")){
                sb.append(back()).append("\n");
            }
            else if(order.contains("size")){
                sb.append(size).append("\n");
            }
            else if(order.contains("empty")){
                sb.append(empty() ? 1 : 0).append("\n");
            }
            else if(order.contains("pop")){
                sb.append(pop()).append("\n");
            }
            else if(order.contains("push")){
                int num = Integer.parseInt(st.nextToken());
                push(num);
            }
        }

        sc.close();

        System.out.println(sb);
    }

    static void push(int num){
        queue[back] = num;
        back++;
        size++;
    }
    
    static int pop(){
        if(empty())
            return -1;
        int result = queue[front];
        
        queue[front] = 0;
        front++;
        size--;
        return result;
    }

    static boolean empty(){
        if(size == 0)
            return true;
        return false;
    }

    static int front(){
        if(empty())
            return -1;
        return queue[front];
    }
    
    static int back(){
        if(empty())
            return -1;
        return queue[back-1];
    }
}