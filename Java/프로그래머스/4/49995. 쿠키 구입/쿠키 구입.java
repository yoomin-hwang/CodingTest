class Solution {
    public int solution(int[] cookie) {
        int answer = 0;
        int li, ri;             // left and right index
        int right = 0;
        int left = 0;
        
        for(int i=0; i<cookie.length-1; i++){
            left = cookie[i];
            li = i;
            right = cookie[i+1];
            ri = i+1;
            while(true){
                if(left == right && answer < left){
                    answer = left;
                }
                if(li > 0 && left <= right){
                    li--;
                    left += cookie[li];
                }
                else if(ri < cookie.length - 1 && right <= left){
                    ri++;
                    right += cookie[ri];
                }
                else
                    break;
            }
        }
//         int sum = 0;
        
//         for(int i=0; i<cookie.length; i++){
//             sum += cookie[i];
//         }
//         for(int i=0; i<cookie.length/2; i++){
//             sum -= cookie[i];
//             if(sum % 2 == 0){
//                 if(answer < sum/2)
//                     answer = sum/2;
//             }
//             sum += cookie[i];
//             sum -= cookie[cookie.length - i - 1];
//             if(sum % 2 == 0){
//                 if(answer < sum/2)
//                     answer = sum/2;
//             }
//             sum -= cookie[i];
//             if(sum % 2 == 0){
//                 if(answer < sum/2)
//                     answer = sum/2;
//             }
//         }
//         if(answer == -1)
//             answer = 0;
        return answer;
    }
}