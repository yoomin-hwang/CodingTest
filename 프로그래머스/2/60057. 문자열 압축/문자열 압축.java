import java.lang.Math;

class Solution {
//     public int solution(String s) {
//         int answer = 0;

//         for(int i=1; i<=(s.length()/2)+1; i++){
//             int result = getSplitedLength(s, i, 1).length();
//             answer = i==1 ? result : (answer>result?result:answer);
//         }

//         return answer;
//     }

//     public String getSplitedLength(String s, int n, int repeat){
//         if(s.length() < n) return s;
//         String result = "";
//         String preString = s.substring(0, n);
//         String postString = s.substring(n, s.length());

//         // 불일치 -> 현재까지 [반복횟수 + 반복문자] 조합
//         if(!postString.startsWith(preString)){
//             if(repeat ==1) return result += preString + getSplitedLength(postString, n, 1);
//             return result += Integer.toString(repeat) + preString + getSplitedLength(postString, n, 1);
//         }

//         return result += getSplitedLength(postString, n, repeat+1);
//     }
    
    public int solution(String s) {
        int answer = s.length();
        
        for(int i=1; i<=s.length()/2; i++){
            int count = 1;
            StringBuilder sb = new StringBuilder();
            String start = s.substring(0, i);
            
            for(int j=i; j<=s.length(); j += i){
                int end = Math.min(j+i, s.length());
                String compare = s.substring(j, end);
                if(compare.equals(start)) count++;
                else{
                    if(count > 1)
                        sb.append(count);
                    sb.append(start);
                    start = compare;
                    count = 1;
                }
            }
            if(i != start.length())
                sb.append(start);
            answer = Math.min(answer, sb.toString().length());
        }
        return answer;
    }
}