import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
Stack<Character> stack = new Stack<Character>();
        
        if(s.charAt(0) == ')')
            return false;

        for(int i=0; i<s.length(); i++){
            if(!stack.isEmpty() && s.charAt(i) == ')'){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        
        answer = (stack.isEmpty()) ? true : false;
        return answer;
    }
}