class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int count = 0;
        for(int num : arr){
            if(num%divisor == 0)
                count++;
        }
        
        if(count == 0){
            answer = new int[1];
            answer[0] = -1;
        }
        
        else{
            answer = new int[count];
            int c=0;
            for(int num : arr){
                if(num%divisor == 0){
                    answer[c] = num;
                    c++;
                }
            }
        
            for(int i=0; i<count; i++){
                for(int j=1; j<count-i; j++){
                    if(answer[j-1] > answer[j]){
                        int temp = answer[j-1];
                        answer[j-1] = answer[j];
                        answer[j] = temp;
                    }
                }
            }
        }
        return answer;
    }
}