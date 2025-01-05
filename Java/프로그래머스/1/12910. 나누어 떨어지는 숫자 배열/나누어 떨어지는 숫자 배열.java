import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        // int[] answer = Arrays.stream(arr).filter(num -> num % divisor == 0).toArray();
        // if(answer.length == 0){
        //     answer = new int[1];
        //     answer[0] = -1;
        // }
        // else Arrays.sort(answer);
        // return answer;
        
        int[] answer = {};
        for(int n : arr) {
            if(n % divisor == 0) {
                answer = Arrays.copyOf(answer, answer.length + 1);
                answer[answer.length - 1] = n;
            }
        }
        
        if(answer.length == 0) {
            answer = new int[1];
            answer[0] = -1;
        }
        else
            Arrays.sort(answer);
        
        return answer;
    }
}