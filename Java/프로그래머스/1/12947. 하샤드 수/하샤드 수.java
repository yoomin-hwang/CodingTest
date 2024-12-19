class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int cur = x;
        int sum = 0;
        
        while(cur != 0){
            sum += cur%10;
            cur /= 10;
        }
        
        if(x%sum != 0) answer = false;
        
        return answer;
    }
}